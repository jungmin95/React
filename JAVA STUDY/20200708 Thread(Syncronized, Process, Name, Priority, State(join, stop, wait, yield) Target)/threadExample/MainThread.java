package threadExample;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while (true) {
//			System.out.println("Thread ������");
//		}
		BeepThread bt = new BeepThread();
		bt.start();
		Runnable br = new BeepRunnable();
		Thread brThread = new Thread(br);
		brThread.start();
		
		System.out.println("main thread ����");
//		for (int i = 0; i < 10; i++) {
//			System.out.println("���");
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				System.out.println("Thread.sleep() �� ��");
//			}
//		}
	}

}

class BeepRunnable implements Runnable {
	@Override
	public void run() {
		// ���๮
		for (int i = 0; i < 10; i++) {
			System.out.println("���");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Thread.sleep() �� ��");
			}
		}
	}

}

class BeepThread extends Thread {
	@Override
	public void run() {
		// ���๮
		for (int i = 0; i < 10; i++) {
			System.out.println("����");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Thread.sleep() �� ��");
			}
		}
	}
}