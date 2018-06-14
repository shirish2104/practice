import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class OurWindow extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton b1;
	OurWindow()
	{
		tf1=new JTextField(5);
		tf2=new JTextField(5);
		tf3=new JTextField(20);
		b1=new JButton("ADD");
		
		add(tf1);
		add(tf2);
		add(b1);
		add(tf3);
		
		b1.addActionListener(this);
		
		Font font=new Font("Verdana",1,20);
		tf1.setFont(font);
		tf2.setFont(font);
		tf3.setFont(font);
		b1.setFont(font);
		
		setLayout( new FlowLayout() );
		setSize(1000,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ar)
	{
		try
		{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			tf3.setText(a+b+"");
		}
		catch(NumberFormatException nf)
		{
			tf3.setText("please enter input numbers");
		}
	}
}
class G5
{
	public static void main(String arg[])
	{
		OurWindow of=new OurWindow();
	}
}
