package kitristudy20200610;

public class Study6 {
	public static void main(String[] args) {
		/*
		 * ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. 
		 * ��, x�� y�� �����̰� ������ ������ 0<=x<=10, 0<=y<=10 �̴�. 
		 */
		for(int x = 0; x<=10; x++) {
			for(int y = 0; y<=10; y++) {
				if((2*x) + (4*y) == 10) {
					System.out.println("x : " + x + "\n" + "y : " + y);
				}
			}
		}
	}
}
