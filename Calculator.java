import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class calculator extends JFrame implements ActionListener { 
static JFrame f; 
static JTextField l; 
String s0, s1, s2;  
calculator() 
{ 
 s0 = s1 = s2 = ""; 
} 
public static void main(String args[]) 
{ 
f = new JFrame("calculator"); 
  
try { 
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
    } 
catch (Exception e) { 
System.err.println(e.getMessage()); 
} 
calculator c = new calculator();  
l = new JTextField(16); 
l.setEditable(false);  
JButton s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, sa, ss, sd, sm, se, seq, seq1; 
  
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
  
seq1 = new JButton("="); 
   
 sa = new JButton("+"); 
 ss = new JButton("-"); 
 sd = new JButton("/"); 
 sm = new JButton("*"); 
 seq = new JButton("C"); 
  
se = new JButton("."); 
JPanel p = new JPanel(); 

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
  
p.setBackground(Color.yellow);  
f.add(p); 
f.setSize(200, 220); 
f.show(); 
} 
public void actionPerformed(ActionEvent e) 
{ 
String s = e.getActionCommand(); 
if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.')
{ 
if (!s1.equals("")) 
s2 = s2 + s; 
else
s0 = s0 + s; 
l.setText(s0 + s1 + s2); 
} 
else if (s.charAt(0) == 'C') 
{ 
s0 = s1 = s2 = ""; 
} 
else if (s.charAt(0) == '=') 
{ 
double te; 
  if (s1.equals("+")) 
  te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
else if (s1.equals("-")) 
  te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
else if (s1.equals("/")) 
  te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
else
  te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
l.setText(s0 + s1 + s2 + "=" + te); 
s0 = Double.toString(te); 
s1 = s2 = ""; 
} 
else { 
 if (s1.equals("") || s2.equals("")) 
s1 = s; 
else { 
double te; 
  
 if (s1.equals("+")) 
 te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
else if (s1.equals("-")) 
 te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
else if (s1.equals("/")) 
 te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
else
 te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
s0 = Double.toString(te); 
s1 = s; 
s2 = ""; 
} 
l.setText(s0 + s1 + s2); 
 } 
 } 
 }