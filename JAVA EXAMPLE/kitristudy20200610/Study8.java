package kitristudy20200610;

public class Study8 {
	/*
	 * �Ǻ���ġ(Fibonnaci) 
	 * ����(���)�� ���� �� ���� ���ؼ� ���� ���� ����� ������ �����̴�. 
	 * ���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� 
	 * �� ���� ���� 1�� 2�� ���ؼ� 3�� �Ǿ 1,1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 
	 * 1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
	// Fibonnaci ������ ������ ù �� ���ڸ� 1, 1�� �Ѵ�. 
	int num1 = 1; 
	int num2 = 1; 
	int num3 = 0; // ����° �� 

	 System.out.print(num1+","+num2); 
	 for (int i = 0 ; i < 8 ; i++ ) { 
	 
		 num3 = num1 + num2;
		 num1 = num2;
		 num2 = num3;
		 System.out.print(","+num3);
	 
	 	} 
	} // end of main } // end of class
}
