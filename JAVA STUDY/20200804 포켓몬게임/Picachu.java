package poketmon.poket;

public class Picachu extends Overr {
	public int cnt;
	public Picachu(String name) {//�ʱ�ȭ
		this.name = name;		//�̸����� �ʱ�ȭ
		race = "Picachu"; 	//������ �̻��ؾ� �ʱ�ȭ
		age = 0;				//���̴� 0���� �ʱ�ȭ
		power = 100;			//�Ŀ��� �⺻�� 150
		energy = 300;			//������ �⺻�� 200
		cnt = 0;				//cnt 0���� �ʱ�ȭ
		System.out.println("��ī�߰� ����������ϴ�");
	}
	public void eat() { //��Դ� �޼���
		energy += 10;	//������ 10������
		cnt++;			//cnt�� 1���� 	
		aging();		//aging()�޼��带 ȣ��
	}
	public void sleep() {//���ڴ� �޼���
		energy += 15; 	//���ڸ� ������ 15����
		cnt++;			//cnt�� 1����
		aging();		//aging()�޼��带 ȣ��
	}
	public void exercise() {	//��ϱ� �޼���
		energy -= 20;	//������ �Ҹ� 20����
		power += 10;	//�Ŀ� 10����
	}
	public void aging() {	//���̸Դ� �޼���
		//cnt�� 5�����Ҷ����� 1�� ����
		if(cnt >= 5) {
			age++;
			cnt=0;
		}
	}
	public void attack() { //�����ϴ� �޼���
		energy -= 15;	//������ 15����
		power += 20;	//�Ŀ� 20����
	}
}
