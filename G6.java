//praveenprince.s43@gmail.com
//shirishveggalam@gmail.com
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class OurWindow extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton bAdd,bSub,bMul,bDiv;
	OurWindow()
	{
		tf1=new JTextField(5);
		tf2=new JTextField(5);
		tf3=new JTextField(20);
		bAdd=new JButton("ADD");
		bSub=new JButton("SUBTRACT");
		bMul=new JButton("MULTIPLY");
		bDiv=new JButton("DIVIDE");
		
		add(tf1);
		add(tf2);
		add(bAdd);
		add(bSub);
		add(bMul);
		add(bDiv);
		add(tf3);
		
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		
		Font font=new Font("Verdana",1,20);
		tf1.setFont(font);
		tf2.setFont(font);
		tf3.setFont(font);
		bAdd.setFont(font);
		bSub.setFont(font);
		bMul.setFont(font);
		bDiv.setFont(font);
		
		setLayout( new FlowLayout() );
		setSize(1000,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			JButton but=(JButton)ae.getSource();
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			if(but==bAdd)  tf3.setText(a+b+"");
			else if(but==bSub) tf3.setText(a-b+"");
			else if(but==bMul) tf3.setText(a*b+"");
			else if(but==bDiv) tf3.setText(a/b+"");
		}
		catch(NumberFormatException nf)
		{
			tf3.setText("please enter input numbers");
		}
	}
}
class G6
{
	public static void main(String arg[])
	{
		OurWindow of=new OurWindow();
	}
}
