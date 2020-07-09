package serverClient;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("��û");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("���� ����");
			
			OutputStream os = socket.getOutputStream();
			String message = "Hi Server";
			byte[] bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			
			InputStream is = socket.getInputStream();
			byte[] buf = new byte[100]; 
			int readCount = is.read(buf);
			String inputMessage = new String(buf,0 , readCount, "UTF-8");
			System.out.println("������ �ޱ� : " + inputMessage);
			
			os.close();
			is.close();
			
		}catch(Exception e) {
			
		} finally {
			try {
				socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
