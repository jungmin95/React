package nestedInterface;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
//		btn.setOnClickListener(new CallListener());
//		btn.touch();
//		
//		btn.setOnClickListener(new MessageListener());;
//		btn.touch();
		
		Button.OnClickListener btn2 = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("��ȭ �ɾ��");
				
			}
		};
		btn2.onClick();
	}

}

class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("��ȭ �ɾ��.");
		
	}
	
}

class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("�޼��� ������.");
		
	}
	
}

