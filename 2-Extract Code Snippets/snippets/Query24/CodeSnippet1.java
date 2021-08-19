import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeSnippet1 {
    String[] f(String[] first, String[] second) {
        List<String> both = new ArrayList<String>(first.length + second.length);
        Collections.addAll(both, first);
        Collections.addAll(both, second);
        return both.toArray(new String[both.size()]);
    }	
}
