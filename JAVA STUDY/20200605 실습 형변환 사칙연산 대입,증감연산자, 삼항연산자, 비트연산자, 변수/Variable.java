package variable;

public class Variable {
	public static void main(String[] args) {
		/*
		 * 2020-06-04
		 * ��������
		 */
		//���� true and false 1byte = 8bit
		boolean bo1 = true;
		boolean bo2 = false;
		
		//������ 2byte = 16bit
		char ch = 'a';
		char ch1 = 97;
		
		System.out.println("ch = " + ch);
		System.out.println("ch1 = " + ch1);
		//������ - ������
		byte by = 0; //1byte
		short sh = 0;//2byte
		int in = 0;//4byte
		long lo = 0;//8byte
		
		int a = 10;   // 10���� 10
		int a8 = 010; // 8���� 8
		int a16 = 0xA; // 16���� 16
		
		by = (byte)127;
		by = 127;
		
		in = 1 + 2; // 4byte + 4byte = 4byte;
		in = 11 + 21;
		//������ - �Ǽ���
		float  f1 = 1.1f; // 4byte
		
		f1 = 1.2f;
		f1 = (float)1.2;
		f1 = 1.2f + 1.3f;		
		
		double du = 1.1; // 4byte
		
		du = 1.0 + 2.0; // 8byte + 8byte = 8byte
	}
}
