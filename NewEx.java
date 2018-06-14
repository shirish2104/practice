import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Window1 extends JFrame 
{
	JButton b1=new JButton("add");
	JButton b2=new JButton("subtract");
	JTextField j1,j2,j3;
	Window1()
	{
		j1=new JTextField(10);
		j2=new JTextField(10);
		j3=new JTextField(10);
		setLayout( new FlowLayout() );
		setSize(1000,700);
		setVisible(true);
		add(j1);
		add(j2);
		add(j3);
		add(b1);
		add(b2);
		Another r1=new Another();
		Another r2=new Another();
		r1.set(this);
		r2.set(this);
		b1.addActionListener( r1);
		b2.addActionListener( r2);
	}
}
class Another implements ActionListener
{
	Window1 w1;
	void set(Window1 w)
	{
		w1=w;
	}
	public void actionPerformed(ActionEvent ae)
	{System.out.print("came here");
		try
		{
			JButton but=(JButton)ae.getSource();
		int	a=Integer.parseInt(w1.j1.getText());
		int b=Integer.parseInt(w1.j2.getText());
		if(but==w1.b1)
		w1.j3.setText((a+b)+"");
		else if(but==w1.b2)
		w1.j3.setText((a-b)+"");
	}
	catch(Exception e)
	{
		System.out.print("invalid input"+e);
	}
}
}
class NewEx
{
	public static void main(String st[])
	{
		 Window1 w=new Window1();
		
	}
}
