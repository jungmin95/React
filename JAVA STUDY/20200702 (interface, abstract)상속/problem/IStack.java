package problem;

public interface IStack {
	
	//���� ������ ����
	public abstract int length();
	//����
	public abstract Object pop();
	//����
	public abstract boolean push(Object ob);
	
	//�б�
	public abstract Object peek();
	//������ ���� ����
	public abstract boolean isEmpty();

}
