package kitristudy20200714_2;

public class Exercise3 {
	static boolean stopped = false;
	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		th1.start();
		
		try {
			Thread.sleep(7*1000);
			
		}catch(Exception e) {}
		stopped = true;
		th1.interrupt();
		
		System.out.println("stopped");

	}

}
class Thread5 extends Thread {
	public void run() {
		for(int i=0; !Exercise3.stopped; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3*1000);
			} catch (Exception e) { }
		}
	}
}