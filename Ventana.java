import java.awt.*;
import javax.swing.*;

public class Ventana{
	public static void main(String []args){
		JLabel user=new JLabel("User");
		JTextField usertext=new JTextField(40);
		JLabel pass=new JLabel("Password");
		JPasswordField password=new JPasswordField(10);
		JButton cerrar=new JButton("CERRAR");
		JButton ok=new JButton("OK!");

		JFrame frame=new JFrame("Login");
		Container cont=frame.getContentPane();
		cont.setLayout(new FlowLayout());
		
		cont.add(user);
		cont.add(usertext);
		cont.add(pass);
		cont.add(password);
		cont.add(cerrar);
		cont.add(ok);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(220,100);
		frame.setResizable(false);
		frame.setVisible(true);
		
}
}
