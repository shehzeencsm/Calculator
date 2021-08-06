import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class calculator extends JFrame implements ActionListener {
 // create a frame
static JFrame f;
 // create a textfield 
static JTextField l;
 // store oprerator and operands
String s0, s1, s2;
 // default constrcutor  
calculator() 
{ 
 s0 = s1 = s2 = ""; 
} 
 // main function
public static void main(String args[]) 
{ 
// create a frame 
f = new JFrame("calculator"); 
  
try { 
 // set look and feel
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
    } 
catch (Exception e) { 
System.err.println(e.getMessage()); 
}
 // create a object of class
calculator c = new calculator();
 // create a textfield 
l = new JTextField(16);
 // set the textfield to non editable 
l.setEditable(false);
 // create number buttons and some operators
JButton s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, sa, ss, sd, sm, se, seq, seq1; 

 // create number buttons
  s0 = new JButton("0"); 
  s1 = new JButton("1"); 
  s2 = new JButton("2"); 
  s3 = new JButton("3"); 
  s4 = new JButton("4"); 
  s5 = new JButton("5"); 
  s6 = new JButton("6"); 
  s7 = new JButton("7"); 
  s8 = new JButton("8"); 
  s9 = new JButton("9"); 
  
 // equals button 
seq1 = new JButton("="); 
  
 // create operator buttons 
 
 sa = new JButton("+"); 
 ss = new JButton("-"); 
 sd = new JButton("/"); 
 sm = new JButton("*"); 
 seq = new JButton("C"); 
 
 // create . button 
se = new JButton("."); 
 
 // create a panel 
JPanel p = new JPanel(); 

 // add action listeners
 sm.addActionListener(c); 
 sd.addActionListener(c); 
 ss.addActionListener(c); 
 sa.addActionListener(c); 
 s9.addActionListener(c); 
 s8.addActionListener(c); 
 s7.addActionListener(c); 
 s6.addActionListener(c); 
 s5.addActionListener(c); 
 s4.addActionListener(c); 
 s3.addActionListener(c); 
 s2.addActionListener(c); 
 s1.addActionListener(c); 
 s0.addActionListener(c); 
 se.addActionListener(c); 
 seq.addActionListener(c); 
 seq1.addActionListener(c); 
  
  // add elements to panel
 p.add(l); 
 p.add(sa); 
 p.add(s1); 
 p.add(s2); 
 p.add(s3); 
 p.add(ss); 
 p.add(s4); 
 p.add(s5); 
 p.add(s6); 
 p.add(sm); 
 p.add(s7); 
 p.add(s8); 
 p.add(s9); 
 p.add(sd); 
 p.add(se); 
 p.add(s0); 
 p.add(seq); 
 p.add(seq1);
  
 // set Background of panel
p.setBackground(Color.yellow); 
 
 // add panel to frame  
f.add(p); 
f.setSize(250, 300); 
f.show(); 
} 
public void actionPerformed(ActionEvent e) 
{ 
String s = e.getActionCommand();
 
// if the value is a number  
if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.')
{ 
 // if operand is present then add to second no
if (!s1.equals("")) 
s2 = s2 + s; 
else
s0 = s0 + s; 
 
 // set the value of text
l.setText(s0 + s1 + s2); 
} 
else if (s.charAt(0) == 'C') 
{ 
s0 = s1 = s2 = ""; 
} 
// set the value of text 
else if (s.charAt(0) == '=') 
{ 
double te; 
 
 // store the value in 1st 
  if (s1.equals("+")) 
  te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
else if (s1.equals("-")) 
  te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
else if (s1.equals("/")) 
  te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
else
  te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
 
 // convert it to string
// set the value of text
l.setText(s0 + s1 + s2 + "=" + te);
 
 // convert it to string
s0 = Double.toString(te); 
s1 = s2 = ""; 
} 
else { 
 // if there was no operand
 if (s1.equals("") || s2.equals("")) 
s1 = s;
 // else evaluate 
else { 
double te; 
  
 // store the value in 1st 
 if (s1.equals("+")) 
 te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
else if (s1.equals("-")) 
 te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
else if (s1.equals("/")) 
 te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
else
 te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
 // convert it to string
s0 = Double.toString(te);
 
// place the operator  
s1 = s; 
 
 // make the operand blank
s2 = ""; 
} 
l.setText(s0 + s1 + s2); 
 } 
 } 
 }
