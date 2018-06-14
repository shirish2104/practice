import java.util.*;
import java.awt.*;
import javax.swing.*;
class G1
{
	public static void main(String arg[])
	{
		String s=new String("smile");
		s.length();
		//s.charCount();		
		System.out.println("a message");
		Scanner sc=new Scanner(System.in);
		
		Frame f=new Frame();
		f.setSize(400,300);
		f.setLocation(1000,500);
		f.setLayout(new FlowLayout());
		f.add(new Button("First"));
		f.add(new Button("Second"));
		f.setVisible(true);

		
		JFrame jf=new JFrame();
		jf.setSize(400,300);
		jf.setLayout(new FlowLayout());
		jf.add(new JButton("First"));
		jf.add(new JButton("Second"));
		jf.setVisible(true);
	}
}
