package interation;

import java.util.Scanner;

public class p136Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����.");
			System.out.println("------------------------------");
			System.out.println("���� >");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("���ݾ� > ");
				int deposit = scanner.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.print("��ݾ� > " );
				int out = scanner.nextInt();
				
				if(balance < out) {
					System.out.print("�ܰ��� ���� ����Ҽ� �����ϴ�.");
				}else {
					balance -= out;
				}
				break;
			case 3:
				System.out.println("�ܰ� >");
				System.out.println("�ܰ� > " + balance);
				break;
				
			case 4:
				run = false;
				break;
			}
			
			
		}
	}

}
