import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CodeSnippet1 {
	public static void main(String[] args) throws Exception {
	String host = "www.yourhost.com";
		Socket socket = new Socket(host, 80);
		String request = "GET / HTTP/1.0\r\n\r\n";
		OutputStream os = socket.getOutputStream();
		os.write(request.getBytes());
		os.flush();

		InputStream is = socket.getInputStream();
		int ch;
		while ((ch = is.read()) != -1)
			System.out.print((char) ch);
		socket.close();
	}
}
