package swingproject.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import swingproject.dao.MemberDAO;
import swingproject.domain.Member;
import swingproject.domain.Sample;

public class MemberListFrame extends JFrame {

	private String customer_id; //����
	private JPanel contentPane;
	private JTable table;
	private JLabel lbTitle;
	private JButton logoutBtn;
	private DefaultTableModel tableModel;

	


	
	
	
	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Member member = new Member();
					MemberListFrame frame = new MemberListFrame();
					
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberListFrame() {
		this(null);
	}
	
	public MemberListFrame(String customer_id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1032, 584);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		System.out.println("memberlistframe : " +customer_id);
		JLabel lbTitle = new JLabel("ȸ������");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("�������", Font.BOLD, 20));
		lbTitle.setPreferredSize(new Dimension( 738, 50 ));
		contentPane.add(lbTitle, BorderLayout.NORTH);
		//db������ ��������
		Vector<String> memberName = Sample.getMemberName();
		MemberDAO dao = MemberDAO.getInstance();
		Vector<Member> members = dao.findByAll();
		
		
		//tableModel�� �� �̸��� �� ���� ����
		tableModel = new DefaultTableModel(memberName,0);
		
		//tableModel�� ��ü �� �ֱ�
		for (int i = 0; i < members.size(); i++) {
			Vector<Object> row = new Vector<>();
			row.addElement(members.get(i).getCustomer_id());
			row.addElement(members.get(i).getCustomer_pw());
			row.addElement(members.get(i).getCustomer_name());
			row.addElement(members.get(i).getCustomer_phone());
			row.addElement(members.get(i).getCustomer_birth());
			row.addElement(members.get(i).getCustomer_address());	
			tableModel.addRow(row);
		}
		
		//tableModel�� JTable�� �ֱ�
		JTable table = new JTable(tableModel);
		
		table.setFont(new Font("����", Font.PLAIN, 20));
		table.setRowHeight(25);
		
		//JTable�� scroll�޾Ƽ� add�ϱ�
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JButton logoutBtn = new JButton("�α׾ƿ�");
		contentPane.add(logoutBtn, BorderLayout.SOUTH);
		
		logoutBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�α׾ƿ�");
				dispose();
				new LoginFrame();
				
			}
		});
		
		
		if(customer_id == null) {
			System.out.println("if��    " + customer_id);
			JOptionPane.showMessageDialog(null, "�������� ���� �����");
			dispose();
			
		} else {
			setVisible(true);
		}
	}

}



