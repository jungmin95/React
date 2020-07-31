package step7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MapServlet
 */
@WebServlet("/MapServlet")
public class MapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//getParmeterMap()
		//�� �������� �������Ķ������ ���� ���Ѵ�.
		// ���� <�Ķ���� �̸�, ��> ������ �����ȴ�.
		
		//��û�� ���ƿ� �����͸� name value ���� ǥ��
		//String key, String[] value
		
		Map<String, String[]> map=request.getParameterMap();
		//map���� key���� ��ȯ�޴´�. keyset();
		//keyset()�� set�� ��ȯ�ϹǷ� iterator()�� �����Ҽ��ִ�.
		//iterator�� �����ϸ鼭 next()�� ȣ���ϸ� key�� ��ȯ�Ȱ�
		//�̴� html name�̴�. name�� map�� ��et(name)�ϸ�
		//value�� ��ȯ�Ǵµ� �� value�� Ÿ���� String[]�̹Ƿ�
		//for loop�� �����ϸ� name�� valeu�� ����ϸ� �ȴ�.
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		String str = null;
		String str1[];
		//map�� object�� ��ȯ�Ǵ� ������
		//map�� ����Ÿ���� ��ȯ�ؾ� �ϴ��� �Ǵ��� �� �� ����.
		//�׷��Ƿ� out.print(it.next());�� �濡��
		//��ü������ �������̵��� toString()���� String���� ������ش�.
		//������ String key=it.next();�� Map�� ���忡�� ������ ��ȯ�ؾ� �ϴ��� �Ǵ� �Ҽ�������.
		// �׷��Ƿ� set<String> set = map.keySset(); / Iterator <String>
		//ó�� ��ʸ��� �����Ͽ� String ���� �޴´ٰ� �������ְų�
		//it.next().toString()�� ���־�� key���� ��¹ޤ��� �� �ִ�.
		//�׷��Ƿ� map�� �ֻ��� ��ü�� object�� ��ȯ�� �ִ� ���̴�.
		
		while(it.hasNext()) {
			str = it.next();
			str1 = map.get(str);
			for(int i =0; i<str1.length; i++ ) {
				out.print(str + " " + str1[i]);
			}
			out.print("<Br>");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
