package variable;

public class Study9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 20200605
		 * ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�, ���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�.
		 *  �����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��.
		 *  ���� ��� 'A���� �ڵ�� 65 �̰� ��a'�� �ڵ�� 97�̴�.
		 *   (1)~(2)�� �˸��� �ڵ带 �����ÿ�
		 */
		
		char ch = 'C';
		char lowerCase = (ch >= 'a' || ch <= 'Z') ? (char)(ch+32) : ch;
		System.out.println("ch:" + ch);
		System.out.println("ch to lowerCase:" + lowerCase);
	}

}
