package interation;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int max = 0;
//		int min = 0;
//		System.out.println("num1 >>");
//		int num1 = sc.nextInt();
//		System.out.println("num2 >>");
//		int num2 = sc.nextInt();
//		
//		System.out.println("num1 : " +num1);
//		System.out.println("num2 : " +num2);
		
		//�ִ� ����� num1, num2
		
		System.out.println("num1 >>");
		int num1 = sc.nextInt();
		System.out.println("num2 >>");
		int num2 = sc.nextInt();
		
//		for(;i<=num1 && i<=num2;){
//			if(num1%i==0&&num2%i==0) 
//				min=i; 
//			i++; 
//		} 
//		max=num1*num2/min; //�ּ� ����� ���ϴ� �� 
//		System.out.println("�ּ� ����� : "+max); 
//		System.out.println("�ִ� ����� : "+min);
		
		//Ǯ��
		
		int minValue = (num1 > num2)? num2 : num1 ;
		
		int min = 0; //�ִ�����
		int max = 0; //�ִ�����
		
		for (int i = 1; i <= num1 ; i++) {
			if((num1 % i == 0)&&(num2 % i == 0)) {
				min = i;
			}
		}
		System.out.println("�ִ� ����� : " + min);
		
		//�ּ� �����
		
		for (int i = 1; i<= 10000000; i++) {
			if ((i%num1 == 0)&&(i%num2 == 0)) {
				max = i;
				break;
			}
		}
		System.out.println("�ּ� ����� : " + max);
	}

}
