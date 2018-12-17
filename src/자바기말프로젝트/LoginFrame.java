package �ڹٱ⸻������Ʈ;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
public class LoginFrame extends JFrame implements ActionListener {
 
    BufferedImage img = null;
    JTextField loginTextField;
    JPasswordField passwordField;
    JButton bt1,bt2;
    static HashMap<String, String> IdPw = new HashMap<>();
 
    // ����
    public static void main(String[] args) {
        new LoginFrame(IdPw);
    }
 
    // ������
    public LoginFrame(HashMap<String, String> IdPw) {
        setTitle("�α��� �׽�Ʈ");
        setSize(1600, 900);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
        // ���̾ƿ� ����
        setLayout(null);
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1600, 900);
        layeredPane.setLayout(null);
 
        // �г�1
        // �̹��� �޾ƿ���
        try {
            img = ImageIO.read(new File("img/login.png"));
        } catch (IOException e) {
            System.out.println("�̹��� �ҷ����� ����");
            System.exit(0);
        }
         
        MyPanel panel = new MyPanel();
        panel.setBounds(0, 0, 1600, 900);
         
 
        // �α��� �ʵ�
        loginTextField = new JTextField(15);
        loginTextField.setBounds(731, 399, 280, 30);
        layeredPane.add(loginTextField);
        loginTextField.setOpaque(false);
        loginTextField.setForeground(Color.green);
        loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        // �н�����
        passwordField = new JPasswordField(15);
        passwordField.setBounds(731, 529, 280, 30);
        passwordField.setOpaque(false);
        passwordField.setForeground(Color.green);
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        layeredPane.add(passwordField);
 
        // �α��ι�ư �߰�
        bt1 = new JButton(new ImageIcon("img/btLogin_hud.png"));
        bt1.setBounds(655, 689, 104, 48);
        bt2 = new JButton(new ImageIcon("img/btSignUp_hud.png"));
        bt2.setBounds(840, 689, 104, 48);
 
        // ��ư ����ó��
        bt1.setBorderPainted(false);
        bt1.setFocusPainted(false);
        bt1.setContentAreaFilled(false);
        bt1.addActionListener(this);
 
        bt2.setBorderPainted(false);
        bt2.setFocusPainted(false);
        bt2.setContentAreaFilled(false);
        bt2.addActionListener(this);
        
        
        layeredPane.add(bt1);
        layeredPane.add(bt2);
        
        // ������ �߰���
        layeredPane.add(panel);
        add(layeredPane);
        setVisible(true);
    }
 
    class MyPanel extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(img, 0, 0, null);
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == bt1)//�α���
		{
			
		}
		else{//ȸ������
			new SignUp(IdPw);
			setVisible(false);
			
		}
		System.out.println("Ŭ����");
		
	}
 
}