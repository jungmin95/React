package poketmon.poket;

public abstract class Overr {
	public String race; //����
	public String name; //ĳ���� �̸�
	public int age; //����
	public int power; //�Ŀ�
	public int energy; //������
	
	public Overr() { //������
		System.out.println("Overr Ŭ����");
	}
	
	public abstract void eat();			//�߻� �޼��� ��Ա�
	public abstract void sleep();		//�߻� �޼��� ���ڱ�
	public abstract void exercise();	//�߻� �޼��� ��ϱ�
	public abstract void aging();		//�߻� �޼��� ���̰� ����
	public abstract void attack();		//�߻� �޼��� ����
	
	public void print() { //���� ĳ���� ���°� ���
		System.out.println("age : " + age);
		System.out.println("power : " + power);
		System.out.println("energy : " + energy);
	}

}
