import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateDatasetR {

	String pathname;
	static File developersEvaluation = new File(
			"/home/carloseduardo/VEM_2021_Replication_Package/4-Developers Evaluation/developersGoogleDocsEvaluation.csv");

	static File outputReadability = new File(
			"/home/carloseduardo/VEM_2021_Replication_Package/5-Results/R_Studio_Readability.csv");
	static File outputUnderstandability = new File(
			"/home/carloseduardo/VEM_2021_Replication_Package/5-Results/R_Studio_Understandability.csv");
	static File outputReadabilityUnderstandability = new File(
			"/home/carloseduardo/VEM_2021_Replication_Package/5-Results/R_Studio_Readability_Understandability.csv");

	static List<Integer> queriesReadability = Arrays.asList(2, 7, 10, 16, 19, 20, 21, 22, 24, 27);
	static List<Integer> queriesUnderstandability = Arrays.asList(3, 6, 9, 11, 15, 18, 23, 26, 28, 30);
	static List<Integer> queriesReadabilityUnderstandability = Arrays.asList(1, 4, 5, 8, 12, 13, 14, 17, 25, 29);

	static List<Integer> bestSnippets = Arrays.asList(1, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1,
			1, 1, 1, 1, 2, 1, 2, 1);

	public static void main(String args[]) throws Exception {
		List<Query> queriesEvaluation = populateDevelopersEvaluation();
		generateOutput(queriesEvaluation, outputReadability, queriesReadability);
		generateOutput(queriesEvaluation, outputUnderstandability, queriesUnderstandability);
		generateOutput(queriesEvaluation, outputReadabilityUnderstandability, queriesReadabilityUnderstandability);
	}

	private static List<Query> populateDevelopersEvaluation() throws Exception {
		List<Query> queriesEvaluation = createQueries();
		BufferedReader br = new BufferedReader(new FileReader(developersEvaluation));
		int count = 0;
		int developer = 1;
		while (br.ready()) {
			String line = br.readLine();
			if (count > 0) {
				String[] fields = line.split(",");
				int query = 0;
				for (int i = 2; i < fields.length - 1; i += 2) {
					if (!isDouble(fields[i].replaceAll("\"", ""))) {
						break;
					}
					int evaluationCodeSnippet1 = Integer.parseInt(fields[i].replaceAll("\"", ""));
					int evaluationCodeSnippet2 = Integer.parseInt(fields[i + 1].replaceAll("\"", ""));
					DeveloperEvaluation developerEvaluation = new DeveloperEvaluation(developer, evaluationCodeSnippet1,
							evaluationCodeSnippet2);
					queriesEvaluation.get(query).addEvaluation(developerEvaluation);
					query++;
				}
				developer++;
			}
			count++;
		}
		br.close();
		return queriesEvaluation;
	}

	private static void generateOutput(List<Query> queries, File output, List<Integer> queriesNumbers)
			throws Exception {
		try (PrintWriter pw = new PrintWriter(output)) {
			pw.println("tool;query;likertAvg");
			for (Integer queryNumber : queriesNumbers) {
				Query query = queries.get(queryNumber - 1);
				pw.println("best;" + query.getNumber() + ";" + query.getAverage("best"));
				pw.println("worst;" + query.getNumber() + ";" + query.getAverage("worst"));
			}
			pw.close();
		}
	}

	private static List<Query> createQueries() {
		List<Query> queriesEvaluation = new ArrayList<>();
		int query = 1;
		for (Integer bestSnippet : bestSnippets) {
			queriesEvaluation.add(new Query(query, bestSnippet));
			query++;
		}
		return queriesEvaluation;
	}

	public static boolean isDouble(String string) {
		try {
			Double.parseDouble(string);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}

