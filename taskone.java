import java.util.*;
import java.lang.*;
class taskone
{
public static void main(String args[])
{
int a[]={10,33,55,25,30};
Scanner o=new Scanner(System.in);
int b,h;
String y;
System.out.println("\n\n\t\t\t**********  WELCOME TO HIDE_&_SEEK WITH COMPUTER  **********");
System.out.println("INSTRUCTION:");
System.out.println("^ This game has 3 rounds.Each round has provided with 5 attempts.");
System.out.println("^ Hints will be provided to guess the number.");
System.out.println("^ Each round has an eligibility points to play.");
System.out.println("^ For 1st round no eligible points required. To play 2nd round you have to score average of 5.5 POINTS in your 1st round");
System.out.println("^ To play 3rd round you have to score average of 7.0 POINTS in your 2nd round");
System.out.println("How to play?");
System.out.println("Guess the correct number that computer have been thought(CG)");
System.out.println("\nEnter you name: ");
y=o.next();
System.out.println("Click one to START  ");
b=o.nextInt();
System.out.println("BEST OF LUCK...!!!");
double n=0;
for(int x=0;x<5;x++)
{
System.out.println("\nEnter your guess From 1 To 30\n");
h=o.nextInt();
if(h==10)
{
System.out.println("\t\t\t__________CONGRATULATION your guess "+h+" is crt....!!!____________");
n+=10;
break;
}
else
{
switch(b)
{
case 1:
int c,i,j;
c=a[0];
i=h-c;
j=Math.abs(i);
if((j>=1)&&(j<=5))
{
System.out.println("\n  .....Close to computer guess,just Add or Sub(5 or 4 or 3 or 2 or 1)from your guess.....");
n+=1.5;
System.out.println("\n\t\t********Try your next attempt********");
}
else if((j>=6)&&(j<=10))
{
System.out.println("\n  .....Your guess is just far from CG,just Add or Sub(6 or 7 or 8 or 9 or 10)from your guess.....");
n+=1;
System.out.println("\n\t\t********Try your next attempt********");
}
else if((j>=11)&&(j<=20))
{
System.out.println("\n  .....Think any other number,just Add or Sub(The numbers from 11 to 20)from your guess.....");
n+=0.5;
System.out.println("\n\t\t********Try your next attempt********");
}
else if(h>30)
{
System.out.println("\n*******Enter your number from 1 to 30 only*******");
}
break;
}
}
}
System.out.println("Your score is : "+n);
if(n>=5.5)
{
System.out.println("\n---------\t\tYou are eligible for next round");
int z;
System.out.println("\n---------\t\tAre you ready for your NEXT challenge...!!!");
System.out.println("\nClick zero to START");
z=o.nextInt();
if(z==0)
{
int gg;
double t=0;
for(int k=0;k<5;k++)
{
System.out.println("Enter your guess From 1 To 50: ");
gg=o.nextInt();
if(gg==33)
{
System.out.println("\t\t\t____________CONGRATULATION your guess "+gg+" is crt...!!!_____________");
t+=10;
break;
}
else
{
switch(z)
{//new
case 0:
int aa,bb,cc;
aa=a[1];
bb=gg-aa;
cc=Math.abs(bb);
if((cc>=1)&&(cc<=10))
{
System.out.println("\n\t\t.....Close to your guess,just Add or Sub(1 to 10 )from your guess.....");
t+=1.5;
System.out.println("\n\t\t******** Try your next attempt ********");
}
else if((cc>=11)&&(cc<=30))
{
System.out.println("\n\t\t.....Your guess is just far from CG,just Add or Sub(11 to 30)from your guess.....");
t+=1;
System.out.println("\n\t\t******** Try your next attempt ********");
}
else if((cc>=31)&&(cc<=50))
{
System.out.println("\n\t\t.....Think any other number,just Add or Sub(31 to 50)from your guess.....");
t+=0.5;
System.out.println("\n\t\t******** Try your next attempt ********");
}
else if(gg>50)
{
System.out.println("\n*******Enter your number from 1 to 50 only*******");
}

}//switch
}//else
}//for loop
System.out.println("Your Score: "+t);
//}//2nd if condition
//}//if condition
if(t>=7.0)
{
System.out.println("\n---------\t\tYou are eligible for next round");
int zz;
System.out.println("\n---------\t\tAre you ready for your NEXT challenge...!!!");
System.out.println("\nClick three to START");
zz=o.nextInt();
if(zz==3)
{
int ggg;
double tt=0;
for(int kk=0;kk<5;kk++)
{
System.out.println("Enter your guess From 1 To 70: ");
ggg=o.nextInt();
if(ggg==55)
{
System.out.println("\t\t\t____________CONGRATULATION your guess "+ggg+" is crt...!!!_____________");
tt+=10;
break;
}
else
{
switch(zz)
{//new
case 3:
int aaa,bbb,ccc;
aaa=a[2];
bbb=ggg-aaa;
ccc=Math.abs(bbb);
if((ccc>=1)&&(ccc<=30))
{
System.out.println("\n\t\t.....Your guess is low,just Add or Sub(25 to 60)from your guess.....");
tt+=3;
System.out.println("\n\t\t******** Try your next attempt ********");
}
else if((ccc>=31)&&(ccc<=50))
{
System.out.println("\n\t\t.....Your guess is just far form CG,just Add or Sub(20 to 30)from your guess.....");
tt+=2;
System.out.println("\n\t\t******** Try your next attempt ********");
}
else if((ccc>=51)&&(ccc<=70))
{
System.out.println("\n\t\t.....Your guess is good ,just Add or Sub(1 to 20)from your guess.....");
tt+=1;
System.out.println("\n\t\t******** Try your next attempt ********");
}
else if(ggg>70)
{
System.out.println("\n*******Enter your number from 1 to 70 only*******");
}

}
}
}
System.out.println("Your Score: "+tt);
double nn;
nn=n+t+tt;
System.out.println("\n\n\n___________________________________________________________________________________________________");
System.out.println("\n\n\t\t\t\t\t\t**********SCOREBOARD....********");
System.out.println("\n\t\t\t\t\t\tName: "+y);
System.out.println("\n\t\t\t\t\t\tTotal Score: "+nn);
}
}
}
}
}//main
}//class







