package interation;

public class NumberOfCase {

	public static void main(String[] args) {
		/*
		 * A�л� 1~5
		 * B�л� 1~5
		 * C�л� 1~5
		 * 5 * 5 * 5 = ����Ǽ� 125����
		 * 5 * 4 * 3 = ���� ����Ǽ� 60����
		 * 1,2,3 = 3,2,1 ����
		 */
		
		int countCase = 0;
		int countP = 0;
		int countC = 0;
		
		
		for(int i = 1; i < 6; i ++) {
			for(int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					System.out.print(" " + i + "," + j + "," + k);
					countCase++;
				}
			}
			System.out.println();
		}
		System.out.println("����� �� : " + countCase);
		System.out.println();
		
		for(int i = 1; i < 6; i ++) {
			for(int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					if(i != j && j != k && i != k) {
						System.out.print(" " + i + "," + j + "," + k);
						countP++;
					}
				}
			}
			System.out.println();
		}
		System.out.println("������ �� : " + countP);
		for(int i = 1; i < 6; i ++) {
			for(int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					if((i<j)&&(j<k)&&(i<k)) {
						System.out.print(" " + i + "," + j + "," + k);
						countC++;
					}
				}
			}
			System.out.println();
		}
		System.out.println("������ �� : " + countC);
	}

}
