public class Thread1 {
	public static void main(String[] args) {
		try {					
			Thread thread = new Thread(){
				public void run(){
					System.out.println("Thread Running");
				}
			};
			thread.start();
		} catch(Exception e) {			
		}
	}
}
