package condition;

import java.util.Scanner;

public class GBB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int com = (int)(Math.random()*3);
		int result = -1;
		
		
		System.out.println("���� ����?");
		int my = s.nextInt();
		System.out.println(com + " " + my);
		if ( com == 0 ) {
			System.out.println("com : ����");
		} else if ( com == 1 ) {
			System.out.println("com : ����");
		} else if ( com == 2 ) { 
			System.out.println("com : ��");
		}
		if ( my == 0 ) {
			System.out.println("my : ����");
		} else if ( my == 1 ) {
			System.out.println("my : ����");
		} else if ( my == 2 ) { 
			System.out.println("my : ��");
		}
		result = (com-my+2)%3;
		//0 com, 1 my, 2 ���
		if ( result == 0 ) {
			System.out.println("com �̰���ϴ�.");
		}else if ( result == 1) {
			System.out.println("my �̰���ϴ�");
		}else if ( result == 2) { 
			System.out.println("�����ϴ�");
		}
	}
}
