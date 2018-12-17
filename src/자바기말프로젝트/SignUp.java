package 자바기말프로젝트;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class SignUp extends JFrame implements ActionListener{

	private TextField id;
	private TextField pwd;
	private TextField name;
	private JButton btn;
	private String idVal;
	private String pwdVal;
	private String nameVal;
	HashMap<String, String> IdPw;
	
	public SignUp(HashMap<String, String> IdPw) {
		setTitle("회원가입");
		setSize(230, 180);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.IdPw = IdPw;
		id = new TextField(20);
		pwd = new TextField(20);
		name = new TextField(20);
		btn = new JButton("확인");
		
		btn.addActionListener(this);
		
		Container c =getContentPane();
		
		c.add(new JLabel("   ID   "));
		c.add(id);
		c.add(new JLabel("PWD"));
		c.add(pwd);
		c.add(new JLabel("이름 "));
		c.add(name);
		c.add(btn);
		
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		idVal = id.getText();
		pwdVal = pwd.getText();
		nameVal = name.getText();
		
		if(IdPw.containsKey(idVal)) {
			JOptionPane.showMessageDialog(null,
					"이미 있는 id입니다", "Message",
					JOptionPane.INFORMATION_MESSAGE);

		}
		else {
			IdPw.put(idVal, pwdVal);
			new LoginFrame(IdPw);
			setVisible(false);
		}
		
		
	}

}
