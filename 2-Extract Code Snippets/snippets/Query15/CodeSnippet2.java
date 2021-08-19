import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
 
public class CodeSnippet2 {
 
    public static void main(String[] args) throws MalformedURLException {
 
        File file;
        URI uri;
        URL url;
 
        file = new File("/Users/d33p4k/Documents/Techndeck/JavaPractice/InputString");
 
        if (file.exists() && file.isFile()) {
 
            System.out.println("PATH: \n" + file.getPath());
 
            // Convert file to a URI
            uri = file.toURI();
            System.out.println("\nURI: \n" + uri.toString());
 
            // Convert URI to a URL
            url = uri.toURL();
            System.out.println("\nURL: \n" + url.toString());
 
        } else {
            System.out.println("File doesn't exist.");
        }
    }
 
}
