package kitristudy20200610;

public class Study9 {
	public static void main(String[] args) {
		
		int number = 12322;
		int tmp = number;
		
		int result = 0;
		
		while (tmp != 0) {
			//
			result = result*10 + tmp%10;
			
			tmp = tmp/10;
		}
		
		if( number == result ) 
			System.out.println(number + "�� ȸ���� �Դϴ�" );
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		
	}
}
