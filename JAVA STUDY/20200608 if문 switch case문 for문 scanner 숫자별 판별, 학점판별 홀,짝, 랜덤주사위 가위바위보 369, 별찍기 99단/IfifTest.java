package condition;

import java.util.Scanner;

public class IfifTest {

	public static void main(String[] args) {
		/*
		 * if 
		 * 95���̻� A+
		 * 90���̻� A
		 * 85���̻� B+
		 * 80���̻� B
		 * 70�̻�    C
		 * 60�̻�    D
		 * ����        F
		 */
		Scanner s = new Scanner(System.in);
		
		int student = 89;
		if (student >= 95) {
			System.out.println("A+");
		}
		else if(student >= 90) {
			System.out.println("A");
		}
		else if(student >= 85) {
			System.out.println("B+");
		}
		else if (student >= 80 && student <= 90) {
			System.out.println("B");
		}
		else if (student >= 70 && student <= 80) {
			System.out.println("C");
			
		}
		else if (student >= 60 && student <= 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		//************************************

		if(student >= 90) {
			if (student % 10 >= 5) {
				System.out.println("A+���� �Դϴ�");
			}else {
			System.out.println("A");
			}
		}
		else if (student >= 80 && student <= 90) {
			if (student % 10 >= 5) {
				System.out.println("B+");
			}else {
			System.out.println("B");
			}
		}
		else if (student >= 70 && student <= 80) {
			System.out.println("C");
			
		}
		else if (student >= 60 && student <= 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		/*
		 * 10�� �ڸ� 1 = ������ 2 = �ܱ���
		 * 1�� �ڸ� 1 = ���� 2 = ���� 3 = �̼�����
		 */
		
		int select = s.nextInt();
		System.out.println("�Է��Ͻÿ� : " + select);
		if (select / 10 == 1) {
			System.out.println("������");
			if(select % 10 == 1) {
				System.out.print("����");
			}else if(select % 10 == 2) {
				System.out.println("����");
			}
		}
		else {
			System.out.println("�ܱ���");
			if(select % 10 == 1) {
				System.out.print("����");
			}else if(select % 10 == 2) {
				System.out.println("����");
			}
		}
		
	}

}
