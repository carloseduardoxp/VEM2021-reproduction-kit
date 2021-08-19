public class MyClass implements Runnable {

	@Override
	public void run() {
		System.out.println("in run() method, method completed.");
	}

	public static void main(String[] args) {
		CodeSnippet1 obj = new MyClass();
		Thread thread1 = new Thread(obj, "Thread-1");
		thread1.start();
		thread1.start(); // will throw java.lang.IllegalThreadStateException at runtime
	}

}
