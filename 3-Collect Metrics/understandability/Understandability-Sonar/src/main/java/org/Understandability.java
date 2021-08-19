package org;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.sonar.java.ast.visitors.CognitiveComplexityVisitor;
import org.sonar.java.checks.verifier.CheckVerifier;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.Tree;

public class Understandability {
	
	public static void main(String args[]) {
		String path = "/home/carloseduardo/VEM_2021_Replication_Package/2-Extract Code Snippets/snippets";
		if (path == null || path.equals("")) {
			System.out.println("Can't receive file");
		}
		File root = new File(path);
		searchDirs(root);
		
	}
	
	private static void searchDirs(File root) {
		if (!root.isDirectory()) {
			calculateMetric(root);
		} else {
			File[] files = root.listFiles();
			for (File file: files) {
				searchDirs(file);
			}
		}
		
	}

	static void calculateMetric(File file) {
		CheckUnderstandability check = new CheckUnderstandability();
		String path = file.getAbsolutePath();
		CheckVerifier.newVerifier()		
		  .onFile(path)
	      .withCheck(check)
	      .verifyNoIssues();
		
		Double metric = check.getTotal().doubleValue();
		Double finalScore = getFinalScore(metric);
		System.out.println("Metric for "+file.getAbsolutePath()+": From Sonar: "+metric+" - final score: "+finalScore);		
	}
	
	static Double getFinalScore(Double metric) {
		double limit = 15.0;
		if (metric >= limit) {
			return 0.0;
		}
		return 1.0 - (metric/limit);
	}

}

class CheckUnderstandability extends IssuableSubscriptionVisitor {

	Integer total = 0;

	@Override
	public List<Tree.Kind> nodesToVisit() {
		return Arrays.asList(Tree.Kind.METHOD, Tree.Kind.CONSTRUCTOR);
	}

	@Override
	public void visitNode(Tree tree) {
		MethodTree method = (MethodTree) tree;
		CognitiveComplexityVisitor.Result result = CognitiveComplexityVisitor.methodComplexity(method);
		total += result.complexity;
	}

	public Integer getTotal() {
		return total;
	}
	
	
}
