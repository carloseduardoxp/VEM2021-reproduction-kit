import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
 
public class CodeSnippet1 {
    public static void main(String[] args) throws MalformedURLException {
        File file = new File("LocalFilePath.txt");
 
        System.out.println("1. Absolute file path :\t"+file.getAbsolutePath());
 
        //Convert local path to URL
        URL url = file.toURI().toURL();
        System.out.println("2. URL of given file is:\t"+url);
 
        //Convert local path to URI
        URI uri = file.toURI();
        System.out.println("3. URI of given file is:\t"+uri);
    }
}
