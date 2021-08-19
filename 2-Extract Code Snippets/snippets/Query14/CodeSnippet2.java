import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CodeSnippet2 {

    public static void main(String args[]) {
        Path file = Paths.get("C:\\Java\\file.txt");
        if(Files.exists(file) && Files.isReadable(file)) {
   	    try {
	        // File reader
 	        BufferedReader reader = Files.newBufferedReader(file, Charset.defaultCharset());

	        String line;
	        // read each line
	        while((line = reader.readLine()) != null) {
	            System.out.println(line);
		    // tokenize each number
		    StringTokenizer tokenizer = new StringTokenizer(line, " ");
		    while (tokenizer.hasMoreElements()) {
		        // parse each integer in file
		        int element = Integer.parseInt(tokenizer.nextToken());
		    }
	        }
	        reader.close();
	    } catch (Exception e) {
	        e.printStackTrace();
  	    }
        }    
    }
}
