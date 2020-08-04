package step5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��û �Ķ���Ϳ� id, pwd�� �д´�
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//���� ��ü�� ȹ���Ѵ�. getSession()�� �Ķ���� false�� �����ϸ� ���� ������
		//������ �̸� ��ȯ�ϰ� ������ null��ȯ , ���� �Ķ���Ͱ� ���ų� true�̸�
		//������ ������� ���� ������ ���� ��ü�� ��ȯ�Ѵ�.
		HttpSession session = request.getSession(true);
		boolean result = false;
		
		//id�� pwd��  "aaa", "123"�̸� �α��Τ� �Ӽ����Ͽ� result������ true�� �����ϰ� ���ǿ� id �����Ѵ�.
		if(id.equals("aaa") && pwd.equals("123")) {
			result = true;
			session.setAttribute("id", id);
			
		}
		//���ǿ� �α��� ����� result�� �����Ѵ�. �α����� ���������� true ���������� false����
		session.setAttribute("result", result);
		
		//������ �̵��� ������ Dispatcher��ü�� �����Ѵ�. �̵��� ��������
		//loginResult.jsp�� �����ߴ�. Dispatcher��ü�� null�� �ƴϸ� forward�� �̵��Ѵ�.
		RequestDispatcher dispatcher = request.getRequestDispatcher("/loginResult.jsp");
		if (dispatcher != null) {
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
