import java.awt.*;
import java.awt.event.*;
public class Aevent3 extends Frame
{
TextField tf;
Button b;
Aevent3()
{
tf=new TextField();
tf.setBounds(60,50,150,20);
b=new Button("click me");
b.setBounds(100,100,50,20);
b.addActionListener(new ActionListener()
{
public void
actionPerformed(ActionEvent e)
{
tf.setText("welcome to niit");
}
}); 
add(b);
add(tf); 
setLayout(null);
setVisible(true);
}
public static void main(String[] args)
{
new Aevent3 ();
}
}