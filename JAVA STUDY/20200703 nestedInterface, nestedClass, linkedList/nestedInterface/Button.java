package nestedInterface;

public class Button {

	interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		//touch Event
//		System.out.println("touch �Ǿ����ϴ�.");
		listener.onClick();
		
	}
}
