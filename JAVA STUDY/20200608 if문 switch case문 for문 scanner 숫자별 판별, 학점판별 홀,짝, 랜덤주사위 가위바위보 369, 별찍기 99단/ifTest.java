package condition;

public class ifTest {

	public static void main(String[] args) {
		
		int x = 11;
		int y = 20;
		
		//���ǹ�
		if (x!=y) {
			//���๮ == true
			System.out.println("x�� y�� �ٸ���.");
			
			
		}// -> false
		
		//���ǹ�
		if (x!=y) {
			//���๮ == true
			System.out.println("x�� y�� �ٸ���.");
			
			
		}// -> false
		
		if (x%2 == 0) {
			System.out.println("¦����");
		}
		else {
			System.out.println("Ȧ����");
		}
		
		if (x == 10 ) {
			System.out.println("x" + "�� 10�̴�");
		} else if ( x == 11) {
			System.out.println("x" + "�� 11�̴�");
		} else if ( x == 12) {
			System.out.println("x" + "�� 12�̴�");
		} else {
			System.out.println("x" + "�� �������� �𸥴�");
		}
		


	}

}
