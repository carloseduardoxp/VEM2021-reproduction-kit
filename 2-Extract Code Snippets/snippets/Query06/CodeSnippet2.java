import java.util.Scanner;
public class CodeSnippet2 {

    public static boolean isLeap(long year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}
