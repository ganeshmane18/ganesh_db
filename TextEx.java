import java.awt.*;
import java.awt.event.*;

public class TextEx extends Frame implements ActionListener
{
	TextField tf1,tf2,tf3;
	Label l1,l2,l3;
	Button btn1,btn2;
	
	TextEx()
	{
		tf1 =  new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		l1 = new Label("Enter Number1 : ");
		l2 = new Label("Enter Number2 : ");
		l3 = new Label("Answer : ");
		l1.setBounds(100,100,200,60);
		l2.setBounds(100,200,200,60);
		l3.setBounds(100,300,200,60);
		tf1.setBounds(330,100,200,60);
		tf2.setBounds(330,200,200,60);
		tf3.setBounds(330,300,200,60);
		add(tf1);
		add(tf2);
		add(tf3);
		add(l1);
		add(l2);
		add(l3);
		
		btn1  = new Button("+");
		btn1.setBounds(150,400,100,40);
		btn2  = new Button("-");
		btn2.setBounds(250,600,100,40);

		
		add(btn1);
		
		add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setSize(700,700);
		setVisible(true);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent e)
	{
		String txt1 = tf1.getText();
		String txt2 = tf2.getText();
		int a  = Integer.parseInt(txt1);
		int b = Integer.parseInt(txt2);
		int c =0 ;
		if(e.getSource() == btn1)
		{	
			c = a+b;
			String txt = String.valueOf(c);
			tf3.setText(txt);
		}
		if(e.getSource() == btn2)
		{
			c = a-b;
			String txt = String.valueOf(c);
			tf3.setText(txt);
		}
	}

	public static void main(String[] args)
	{
		new TextEx();
	}
}
				
		