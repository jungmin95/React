package condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� 1~3 :");
		int a = s.nextInt();
		switch(a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default :
			System.out.println("default");
		
		}
		System.out.println("program end");
		
		int code = 12;
		if ( code / 10 == 2 ) {
			System.out.println("�ܱ���");
			if(code % 10 == 1) {
				System.out.println("����");
			} else if ( code % 10 == 2) {
				System.out.println("����");
			}
		} else if ( code / 10 == 1 ) {
			System.out.println("������");
			if(code % 10 == 1) {
				System.out.println("����");
			} else if ( code % 10 == 2) {
				System.out.println("����");
			}
		}
		
	}

}
