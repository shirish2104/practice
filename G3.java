import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class OurWindow extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton b1;
	OurWindow()
	{
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		b1=new JButton("ADD");
		
		add(tf1);
		add(tf2);
		add(b1);
		add(tf3);
		
		b1.addActionListener(this);
		
		setLayout( new FlowLayout() );
		setSize(1000,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ar)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		tf3.setText(a+b+"");
	}
}
class G3
{
	public static void main(String arg[])
	{
		OurWindow of=new OurWindow();
	}
}
