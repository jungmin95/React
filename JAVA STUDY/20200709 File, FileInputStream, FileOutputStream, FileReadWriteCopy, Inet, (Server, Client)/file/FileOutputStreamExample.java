package file;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		
		String filePath = "C:/test/test2.txt";
		String text = "Hi Hello����������";
		byte[] textByte = text.getBytes();
		
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			
			
			
			fos.write(textByte, 0, textByte.length);
			
			fos.close();
		} catch (Exception e) {
			
		}
		System.out.println("���α׷� ����");
	}

}
