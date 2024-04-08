import java.io.*;
import java.util.*;
class rec
{
public static void main(String args[])
{
int sidelength;
char symbol;
Scanner s = new Scanner(System.in);
System.out.println("enter the sidelength:");
sidelength  = s.nextInt();
System.out.println("enter the symbol:");
symbol = s.next().charAt(0);
for(int i=1;i<=sidelength;i++)
{
for(int j=1;j<=sidelength;j++)
{
if(i==1 || i==sidelength || j==1 || j==sidelength)
{
System.out.print(symbol + " ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}
