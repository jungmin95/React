package nestedClass;

public class A {
	A() {
	}
	//��ø �������̽�
	interface IB {
		static final double PI = 3.14;
		public abstract void method();
	}
	// �ν��Ͻ� ��� Ŭ���� : �ν��Ͻ��� ����ƽŬ���� x
	class B {
		int field;

		// static int staticfield;
		void method() {
		}
		// static void methodStatic() { }
	}

	static class C {
		int field;
		static int staticfield;

		void method() {
		}

		static void methodStatic() {
		}
	}

	void method() {
		class D {
			int field;

			//static int staticfield;
			void method() {}
			// static void methodStatic() { }
		}
		D d = new D();
		d.field =3;
		d.method();
	}
}
