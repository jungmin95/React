package interation;

public class p136Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = (int)(Math.random()*6)+1;
//		int num2 = (int)(Math.random()*6)+1;
//		while((num1 + num2) == 5) {
//			num1 = (int)(Math.random()*6)+1;
//			num2 = (int)(Math.random()*6)+1;
//			if (num1 + num2 == 5) {
//				System.out.println(num1 + ", " + num2);
//				System.out.println("�ֻ����� ���� 5�Դϴ�");
//			}else {
//				continue;
//			}
//
//		}
		//Ǯ��
		boolean run = true;
		while (run) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + ", " + num2 + ")");	
			
			if (num1 + num2 == 5) {
				run = false;
				System.out.println("�μ��� ���� 5�Դϴ�");
			}
			
		}
	}

}
