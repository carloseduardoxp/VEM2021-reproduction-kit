public class CodeSnippet2 {
	public static void main(String args[]) {
		String fname = "C:\\textfiles\\db\\query\\query.txt";
		String split[] = fname.split("\\\\");
		System.out.println(" :: value " + split[0]);
	}
}
