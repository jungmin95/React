package poketmon.poket;

public class Gobook extends Overr{
	public int cnt;
	public Gobook(String name) {//�ʱ�ȭ
		this.name = name;		//�̸����� �ʱ�ȭ
		race = "Gobook"; 	//������ �̻��ؾ� �ʱ�ȭ
		age = 0;				//���̴� 0���� �ʱ�ȭ
		power = 50;			//�Ŀ��� �⺻�� 150
		energy = 150;			//������ �⺻�� 200
		cnt = 0;				//cnt 0���� �ʱ�ȭ
		System.out.println("�̻��ؾ��� ����������ϴ�");
	}
	public void eat() { //��Դ� �޼���
		energy += 05;	//������ 10������
		cnt++;			//cnt�� 1���� 	
		aging();		//aging()�޼��带 ȣ��
	}
	public void sleep() {//���ڴ� �޼���
		energy += 5; 	//���ڸ� ������ 5����
		cnt++;			//cnt�� 1����
		aging();		//aging()�޼��带 ȣ��
	}
	public void exercise() {	//��ϱ� �޼���
		energy -= 10;	//������ �Ҹ� 10����
		power += 10;	//�Ŀ� 10����
	}
	public void aging() {	//���̸Դ� �޼���
		//cnt�� 3�����Ҷ����� 1�� ����
		if(cnt >= 3) {
			age++;
			cnt=0;
		}
	}
	public void attack() { //�����ϴ� �޼���
		energy -= 15;	//������ 15����
		power += 20;	//�Ŀ� 20����
	}
}
