package variable;

public class Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*�Ʒ��� ���� num�� ���� ���� �������, ��������, ��0���� ����ϴ� �ڵ��̴�.  
		 * ���� �����ڸ� �̿��ؼ� (1)�� �˸��� �ڵ带 �����ÿ�. 
		 * [Hint] ���� �����ڸ� �� �� ����϶�
		 */
		
		int num = 10;
		String a = "���";
		String b = "����";
		String c = "0";
		String e = (num > 0)? a:
						(num < 0)? b:c;
		System.out.println(e);
	}

}
