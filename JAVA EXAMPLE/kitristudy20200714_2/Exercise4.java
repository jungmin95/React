package kitristudy20200714_2;

import javax.swing.JOptionPane;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise th1 = new Exercise(); 
		th1.start();
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ� .");
		th1.interrupt();
	}

}
class Exercise extends Thread {
	public void run() {
		int i = 10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {interrupt();}
			
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}