import java.util.*;

public class CodeSnippet1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.entrySet().forEach(entry -> System.out.println(entry.getValue()));
    }
}
