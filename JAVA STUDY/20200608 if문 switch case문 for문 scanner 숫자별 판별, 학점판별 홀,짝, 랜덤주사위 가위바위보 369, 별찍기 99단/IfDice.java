package condition;

public class IfDice {

	public static void main(String[] args) {
		int num = (int) (Math.random()*100) +1;
		System.out.println(num);
		
		double dou = Math.random();
//		System.out.println(dou);
		
		int comnum = (int) (Math.random()*3);
		if(comnum == 0) {
			System.out.println("com : ����");
		}else if(comnum == 1) {
			System.out.println("com : ����");
		}else {
			System.out.println("com : ��");
		}
		
		int mynum = (int) (Math.random()*3);
		if(mynum == 0) {
			System.out.println("my : ����");
		}else if(mynum == 1) {
			System.out.println("my : ����");
		}else {
			System.out.println("my : ��");
		}
		if (comnum == 0) {
			if(mynum == 0) {
				System.out.println("�����ϴ�");
			}else if(mynum == 1) {
				System.out.println("my:�¸�");
			}else if(mynum == 2) {
				System.out.println("com:�¸�");
			}
		}else if(comnum == 1) {
			if(mynum == 0) {
				System.out.println("com:�¸�");
			}else if(mynum == 1) {
				System.out.println("�����ϴ�");
			}else if(mynum == 2) {
				System.out.println("my:�¸�");
			}
		}else {
			if(mynum == 0) {
				System.out.println("my:�¸�");
			}else if(mynum == 1) {
				System.out.println("com: �¸�");
			}else if(mynum == 2) {
				System.out.println("�����ϴ�");
			}
		}
		/*
		 * GBB 0 ����
		 *     1 ����
		 *     2 ��
		 *    COM = 1 ����
		 *    MY =  0 ����
		 */

	}

}
