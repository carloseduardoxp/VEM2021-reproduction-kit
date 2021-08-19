import java.util.*;

public class CodeSnippet2 {
	public static void main(String[] args) {
	    String time = "06/27/2012 09:00";
            DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            Date date = sdf.parse(time);
            System.out.println("TIME BEFORE PARSE: " + time);
            System.out.println("TIME AFTER PARSE : " + date);
	}
}
