package nestedClass;

public class Main {
	public static void main(String[] args) {

		A a = new A(); //�Ϲ�

		A.B b = a.new B(); //���� �ν��Ͻ�Ŭ����

		A.C c = new A.C(); //���� ����ƽ���

		a.method(); //���ø��
	}
}
