package variable;

public class Operator_Ex4 {

	public static void main(String[] args) {
		//��Ȳ������ := if (���ǹ�)
		// boolean bool = (���ǹ� (|| &&))?(��) : (����);
		boolean bool = (1 != 1) ? true : false;
		System.out.println(bool);

		int in = (1==1)?((1==1)? 20:30):10;
		System.out.println(in);
	}

}
