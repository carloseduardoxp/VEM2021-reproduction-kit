public class CodeSnippet2 {
	public String reverse(String s) {
		if (s.length() <= 1) {
			return s;
		}
		return reverse(s.substring(1, s.length())) + s.charAt(0);
	}
}
