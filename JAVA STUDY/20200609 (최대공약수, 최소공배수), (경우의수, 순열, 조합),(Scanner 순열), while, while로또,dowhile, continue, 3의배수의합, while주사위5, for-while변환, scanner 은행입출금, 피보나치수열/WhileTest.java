package interation;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while ([���ǹ�]) {}
		
		int num = 1;
		int sum = 0;
		while (num<11) {
			sum += num;
			System.out.println(num);
			num++;
		}
		System.out.println(sum);
		
		//2~9�� ������ ���
		int a = 2;
		
		while (a < 10) {
			int b = 1;
			while (b < 10 ) {
				System.out.println(a + " * " + b + " = " + (a*b));
				b++;
			}
			a++;
			
		}
 	}

}
