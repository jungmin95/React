package interation;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//������ �ܺο��� �޾Ƽ� ���
		//����� ��
		System.out.println("n�� �� : ");
		int n = s.nextInt();
		System.out.println("r�� �� : ");
		int r = s.nextInt();
		System.out.print(n + "," + r + " ");
		
		//����� ��
		int NumOfCase = 1;
		
		for ( int i = 1; i <= r; i++ ) {
			
			NumOfCase *= n;
		}
		System.out.println(NumOfCase);
		
		
		//��������
		// 3! = 1*2*3
		int facN = 1;
		int facR = 1;
		int facNminR = 1;
		int fac = 1;
		for (int i = 1; i<=3; i++) {
			fac = fac * i;
		}
		for (int i = 1; i<=n; i++) {
			facN = facN * i;
		}
		for (int i = 1; i<=r; i++) {
			facR = facR * i;
		}
		for (int i = 1; i<= (n-r); i++) {
			facNminR = facNminR * i;
		}
//		for(n = n; n<6; n++) {
//			for(r = r; r<5; r++) {
//				System.out.print(n + "," + r + " ");
//			}
//		}
//		//��������
//		System.out.println("n�� �� : ");
//		n = s.nextInt();
//		System.out.println("r�� �� : ");
//		r = s.nextInt();
//		for(n = n ; n<6; n++) {
//			for(r = r; r<5; r++) {
//				if(n!=r) {
//				System.out.print(n + "," + r + " ");
//				}
//			}
//		}
		
		//���հ���
		
	}

}
