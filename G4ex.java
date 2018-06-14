import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class OurWindow extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3;
	OurWindow()
	{
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		b1=new JButton("ADD");
		b2=new JButton("SUM");		
		b3=new JButton("PROCESS");
				
		add(tf1);
		add(tf2);
		add(b1); add(b2); add(b3);
		add(tf3);
		
		Extra e=new Extra();
		b3.addActionListener(e);
		// the object (infact, its class) specified as argument to
		// addActionListener() should implement ActionListener
		
		
		tf1.setFont(new Font("Verdana",1,20));
		tf2.setFont(new Font("Verdana",1,20));
		tf3.setFont(new Font("Verdana",1,20));
		b1.setFont(new Font("Verdana",1,20));
		
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
class G4ex
{
	public static void main(String arg[])
	{
		OurWindow of=new OurWindow();
	}
}

class Extra implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Extra action");
	}
}
