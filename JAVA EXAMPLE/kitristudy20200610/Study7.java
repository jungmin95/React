package kitristudy20200610;

public class Study7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * intŸ���� ���� num �� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�. 
		 * �� �� ���� num�� ���� 12345���, 
		 * ��1+2+3+4+5���� ����� 15�� ����϶�
		 */
		
		int num = 1234; int sum = 0; 
		 
		// ** �ڵ� �ۼ� ** 
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("sum="+sum); 
	}

}
