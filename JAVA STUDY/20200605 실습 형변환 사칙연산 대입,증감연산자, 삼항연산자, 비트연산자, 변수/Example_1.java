package variable;

import java.util.Scanner;

public class Example_1 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		/* 20200605
		 * ���׿����� ���
		 * student = 89
		 * 90���̻� A
		 * 80���̻� B
		 * 70���̻� C
		 * 60���̻� D
		 * ����        F
		 */
		int student = 89;
		
		char c = (student >= 90)?((student >= 80 && student <=90)? 'B':'C'): 'B';
		
		
		char score = (student >= 90)? 'A':
					 (student <= 90 && student >= 80)? 'B':
					 (student <= 80 && student >= 70)? 'C':
					 (student <= 70 && student >= 60)? 'D':
						 								'F';
		
		System.out.println("�л��� ������" + score + "���� �Դϴ�");

		/*
		 * number = 10
		 * ¦�� Ȧ�� �Ǻ�
		 */
		
		int number = 10;
		
		boolean numbering = (number % 2 == 0)? true:false;
		
		System.out.println("¦����" + numbering + "�Դϴ�");
		
		
		

	}
}
