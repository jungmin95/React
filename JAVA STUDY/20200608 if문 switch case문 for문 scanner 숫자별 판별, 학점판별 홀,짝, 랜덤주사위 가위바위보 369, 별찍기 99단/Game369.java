package condition;

public class Game369 {
	public static void main(String[] args) {
//		for (int i = 1; i < 41; i++) {
//			if((i/10 == 3) || (i%10 == 3) || (i%10 == 6) || (i%10 == 9)) {
//				System.out.print("¦ ");
//			} else {
//				System.out.print(i + " ");
//			}
//		}
		//Ǯ��
		for(int i = 1; i < 41; i++) {
			int temp = i;
			boolean flagShowNum = true;
			
			for (;temp!=0;) {
				int condition = temp % 10; //1���ڸ�
				if(condition %3 == 0 && condition != 0) {
					System.out.print("¦");
					flagShowNum = false;
				}
				temp /= 10;
			}
			if(flagShowNum) {
				System.out.println(i + " ");
				
			}else {
				System.out.println(" ");
			}
		}
	}
}
