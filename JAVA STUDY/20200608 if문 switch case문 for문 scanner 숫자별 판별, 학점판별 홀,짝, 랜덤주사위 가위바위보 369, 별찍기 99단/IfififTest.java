package condition;

import java.util.Scanner;

public class IfififTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
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
