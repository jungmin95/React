package car;

public class BMW extends Car {
	BMW() {
		super("str");
		System.out.println("BMW() ������");
	}
	String engine = "�θ�����������";
	public static void main(String[] args) {

		BMW bmw = new BMW();
		System.out.println(bmw.engine);
		bmw.run();
	}
}
