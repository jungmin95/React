package condition;

public class ForTest {

	public static void main(String[] args) {
//		for ([�ʱⰪ] ; [����] ; [����]) {
//			//���๮
//		}
		
		for (int i = 1 ; i < 11; i ++) {
			System.out.print(" " +i);
		}
		System.out.println();
		for (int j = 10; j > 0; j--) {
			System.out.print(" " +j);
		}
		System.out.println();
		for (int i = 1; i < 11; i ++) {
			if(i%2 == 0) {
				
				System.out.print(" " + i);
			}
		}
		int i = 2;
		int j = 0;
		for (i = 2; j < 10; j++) {
			System.out.println("2 * " + j + " = " + i*j);
		}
		//Ǯ��
		for (i = 1; i < 10; i ++ ) {
			System.out.println("2 * " + i + "= " + (i*2));
		}
		for (i = 1; i < 41; i++) {
			if((i/10 == 3) || (i%10 == 3) || (i%10 == 6) || (i%10 == 9)) {
				System.out.print("¦");
			} else {
				System.out.print(i);
			}
		}
		
	}

}
