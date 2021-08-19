public class CodeSnippet2 {
	public static void main(String args[]) {
		String[] evenodd = { " number is even", " number is odd" };
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				System.out.println(i + evenodd[i % 2]);
			else
				System.out.println(i + evenodd[i % 2]);
		}
	}
}
