import javax.swing.*;

public class ToolTipEx
{
	JFrame f;
	JLabel l;
	JPasswordField pass,tf;
	ToolTipEx()
	{
		f = new JFrame();
		l = new JLabel("Enter Password : ");
		l.setBounds(50,100,150,60);
		pass = new JPasswordField();
		pass.setBounds(220,100,150,60);
		tf = new JPasswordField();
		tf.setBounds(220,200,150,60);
		pass.setToolTipText("Enter Password");
		f.add(l);
		f.add(pass);
		f.add(tf);
		f.setSize(505,505);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new ToolTipEx();
	}
}
		