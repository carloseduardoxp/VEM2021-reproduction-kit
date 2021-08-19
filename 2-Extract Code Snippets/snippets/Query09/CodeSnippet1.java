public class CodeSnippet1 {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
 	char[] copyTo = new char[10];

	System.arraycopy(copyFrom, 1, copyTo, 2, 8);
	System.out.println(new String(copyTo));
    }
}
