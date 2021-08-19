import java.util.*;

public class CodeSnippet2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
