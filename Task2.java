import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

class student002
{
void window()
//public static void main(String args[])
{
Scanner o=new Scanner(System.in);
String aa[]=new String[7];
JFrame f=new JFrame();
JFrame g=new JFrame();
JButton button=new JButton();
button.setText("SUBMIT");	
JLabel l=new JLabel();	//headline
JLabel l1=new JLabel();	//student label
JLabel l2=new JLabel();	 //rollno label
JLabel l3=new JLabel();	//grade label
JLabel l4=new JLabel();	//dob label
JLabel l5=new JLabel();	//phone label
JLabel l6=new JLabel(); //father name
JLabel l7=new JLabel(); //mother name
JLabel l8=new JLabel(); //gender
Font fn=new Font("Calibri",Font.BOLD,25);//15//labelfont
//Font fnn=new Font("Arial",Font.BOLD,20);
//Font fnnn=new Font("Arial Rounded MT Bold",Font.PLAIN,23);//textfont//15
Font fnnn=new Font("Calibri",Font.BOLD,25);
Font fnnnn=new Font("null",Font.PLAIN,15);
JTextField t1=new JTextField(10);	//student text
t1.setFont(fnnn);
JTextField t2=new JTextField(5);              //rollno text
t2.setFont(fnnn);
JTextField t3=new JTextField(3);	//grade text
t3.setFont(fnnn);
JTextField t4=new JTextField(8);	//dob text
t4.setFont(fnnn);
JTextField t5=new JTextField(10);	//phone
t5.setFont(fnnn);
JTextField t6=new JTextField(10);	//father
t6.setFont(fnnn);	
JTextField t7=new JTextField(10);	//mother
t7.setFont(fnnn);
//JTextField t8=new JTextField(10);	//gender
//t8.setFont(fnnn);
l.setText("STUDENT INFORMATION");
l.setForeground(Color.white);
l.setFont(fnnn);
l1.setText("           Student Name  :");
l1.setFont(fn);
l1.setForeground(Color.white);
l2.setText("Roll No            :");
l2.setFont(fn);
l2.setForeground(Color.white);
l3.setText("      Grade       :");
l3.setFont(fn);
l3.setForeground(Color.white);
l4.setText("             Date of Birth :");
l4.setFont(fn);
l4.setForeground(Color.white);
l5.setText("                 Contact No    :");
l5.setFont(fn);
l5.setForeground(Color.white);
//l8.setText("Gender   :  ");
//l8.setFont(fn);
//l8.setForeground(Color.white);
l6.setText("                      Father Name:");
l6.setFont(fn);
l6.setForeground(Color.white);
l7.setText("                  Mother Name:");
l7.setFont(fn);
l7.setForeground(Color.white);
button.setFont(fnnnn);
f.setLayout(new FlowLayout());
f.add(l);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
//f.add(l8);
//f.add(t8);
f.add(l4);
f.add(t4);
f.add(l3);
f.add(t3);
f.add(l6);
f.add(t6);
f.add(l7);
f.add(t7);
f.add(l5);
f.add(t5);
f.add(button);
f.setVisible(true);
f.setResizable(false);
f.setSize(500,600);
f.getContentPane().setBackground(new Color(0x123456));
button.setBounds(230,100,20,30);
button.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==button)
{
String a[]={t1.getText(),t2.getText(),t4.getText(),t3.getText(),t6.getText(),t7.getText(),t5.getText()};
System.out.println("_________________   Student Information  _________________\n\n");
System.out.println("Name: "+a[0]);
System.out.println("RollNo: "+a[1]);
//System.out.println("Gender: "+a[2]);
System.out.println("D.O.B: "+a[2]);
System.out.println("Grade: "+a[3]);
System.out.println("Father Name: "+a[4]);
System.out.println("Mother Name: "+a[5]);
System.out.println("Contact No: "+a[6]);
int m=119527;
int no=3521;
System.out.println("\n\n_________________________________________________________\n");
System.out.println("->             Want to Edit something (yes/no)"); 
String n;
int t;
n=o.next();
t=n.hashCode();
if(m==t)	//first if 
{
for(int x=0;x<6;x++)	//for loop
{
System.out.println("\n->            Which one do you want to edit?\n");
System.out.println("  * Studentname- sn, Rollno- rn, Grade- gr, dob- dob");
System.out.println("  * Fathername- fn, Mothername- mn, Contactno- cn");
String b;
int c;
b=o.next();
c=b.hashCode();
int sn=3675;	//studentname
int rn=3644;	//rollno
//int gn=3303;	//gender
int dob=99639;	//dob
int gr=3307;	//grade
int fn=3272;	//fathername
int mn=3489;	//mothername
int cn=3179;	//collegename
if(c==sn)  //8.00pm
{
System.out.println("Enter Student Name: ");
String t1;
t1=o.next();
a[0]=t1;
System.out.println("\n->   Updated Successfully.....");
String z1;
System.out.println("->   Do you want to edit something(yes/no)");
z1=o.next();
int Z1;
Z1=z1.hashCode();
if(no==Z1)
{
break;
}
} //label 8.00pm
else if(c==rn)		//8.01pm
{
System.out.println("Enter RollNo: ");
String t2;
t2=o.next();
a[1]=t2;
System.out.println("\n->   Updated Successfully.....");
String z2;
System.out.println("->   Do you want to edit something(yes/no)");
z2=o.next();
int Z2;
Z2=z2.hashCode();
if(no==Z2)
{
break;
}
} //label 8.01pm
else if(c==dob)	//8.02pm
{
System.out.println("Enter D.O.B: ");
String t3;
t3=o.next();
a[2]=t3;
System.out.println("\n->   Updated Successfully.....");
String z3;
System.out.println("->   Do you want to edit something(yes/no)");
z3=o.next();
int Z3;
Z3=z3.hashCode();
if(no==Z3)
{
break;
}
}	//label 8.02pm
else if(c==gr)	//8.03pm
{
System.out.println("Enter Grade: ");
String t4;
t4=o.next();
a[3]=t4;
System.out.println("\n->   Updated Successfully.....");
String z4;
System.out.println("->   Do you want to edit something(yes/no)");
z4=o.next();
int Z4;
Z4=z4.hashCode();
if(no==Z4)
{
break;
}
} 	//label 8.03pm
else if(c==fn)	//8.04pm
{
System.out.println("Enter Father Name: ");
String t5;
t5=o.next();
a[4]=t5;
System.out.println("\n->   Updated Successfully.....");
String z5;
System.out.println("->   Do you want to edit something(yes/no)");
z5=o.next();
int Z5;
Z5=z5.hashCode();
if(no==Z5)
{
break;
}
} 	//label 8.04pm
else if(c==mn)	//8.05pm
{
System.out.println("Enter Mother Name: ");
String t6;
t6=o.next();
a[5]=t6;
System.out.println("\n->   Updated Successfully.....");
String z6;
System.out.println("->   Do you want to edit something(yes/no)");
z6=o.next();
int Z6;
Z6=z6.hashCode();
if(no==Z6)
{
break;
}
} 	//label 8.05pm
else if(c==cn)	//8.06pm
{
System.out.println("Enter ContactNO: ");
String t7;
t7=o.next();
a[6]=t7;
System.out.println("\n->   Updated Successfully.....");
String z7;
System.out.println("->   Do you want to edit something(yes/no)");
z7=o.next();
int Z7;
Z7=z7.hashCode();
if(no==Z7)
{
break;
}
} 	//label 8.06pm
}  //label for loop
System.out.println("___________________________________________________\n");
System.out.println("->      Updated Information\n");
System.out.println("Name: "+a[0]);
System.out.println("RollNo: "+a[1]);
System.out.println("D.O.B: "+a[2]);
System.out.println("Grade: "+a[3]);
System.out.println("Father Name: "+a[4]);
System.out.println("Mother Name: "+a[5]);
System.out.println("Contact No: "+a[6]);
System.out.println("\n____________________________________________________");
} //label first if 
else
{
System.out.println("\n->   Details are Saved");
}
try
{
System.out.println("FileName: ");
String vv;
vv=o.next();
File file=new File(vv);
if(!file.exists())
{
file.createNewFile();
}
PrintWriter pw=new PrintWriter(file);
pw.println("Name: "+a[0]);
pw.println("RollNo: "+a[1]);
pw.println("D.O.B: "+a[2]);
pw.println("Grade: "+a[3]);
pw.println("Father Name: "+a[4]);
pw.println("Mother Name: "+a[5]);
pw.println("Contact No: "+a[6]);
pw.close();
System.out.println("Done");
}catch(IOException h){
h.printStackTrace();
}
}
}
});
}
}
class Task2
{
public static void main(String args[])
{
student002 p=new student002();
for(int jkl=0;jkl<3;jkl++)
{
p.window();
}
}
}
