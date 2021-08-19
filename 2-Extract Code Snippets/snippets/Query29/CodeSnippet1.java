import java.io.FileNotFoundException;
import java.util.zip.ZipException;

public class CodeSnippet1 {
	public static void main(String[] args) {
		try {
			// common logic to handle both exceptions
		} catch (Exception ex) {
			if (ex instanceof FileNotFoundException || ex instanceof ZipException) {

			} else {
				throw ex;
				// or if you don't want to have to declare Exception use
				// throw new RuntimeException(ex);
			}
		}
	}
}
