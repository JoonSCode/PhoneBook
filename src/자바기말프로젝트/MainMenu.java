package �ڹٱ⸻������Ʈ;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MainMenu extends JFrame{

	public MainMenu() {
		setTitle("������");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		Container c =getContentPane();

		c.setLayout(new FlowLayout());
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainMenu();
	}

}
