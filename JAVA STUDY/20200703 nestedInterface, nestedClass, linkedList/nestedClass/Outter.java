package nestedClass;

public class Outter {
	String outter = "Outter field";
	NestedClass nc = new NestedClass(); // ����Ŭ�����̱⶧���� ���ο��� ���ٰ���
	
	void method() {
		System.out.println("Outter method");
	}
	
	void runNestedClass() {
		nc.nestedMethod();
		System.out.println(nc.nested);
	}
	
	class NestedClass {
		NestedClass() {}
		String nested = "Nested field";
//		static int staticA = 10;
		void nestedMethod() {
			System.out.println("Nested method");
		}
//		static void nestedStaticMethod() {
//			System.out.println("NestedStaticMethod");
//		}
	}
}

class Outter2 {
	Outter out = new Outter();
	// NestedClass nc = new NestedClass(); ���ٺҰ� (���� Ŭ�����̱⶧���� �ܺο��� ����x)
}