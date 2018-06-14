import java.awt.*;
import javax.swing.*;
class G2
{
	public static void main(String arg[])
	{
		JFrame jf=new JFrame();
		jf.setSize(400,300);
		jf.setTitle("Our Swing Window");
		jf.add(new JButton("First"));
		jf.add(new JButton("Second"));
		jf.setVisible(true);
	}
}
