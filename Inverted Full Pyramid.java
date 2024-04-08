import java.io.*;
import java.util.*;
class rec
{
public static void main(String args[])
{
int rows;
Scanner s = new Scanner(System.in);
System.out.println("enter no.of rows:");
rows = s.nextInt();
for(int i=rows;i>=1;i--)
{
for(int j=0;j<rows-i;j++)
{
System.out.print("   ");
}
for(int j=1;j<=2*i-1;j++)
{
System.out.print(" * ");
}
System.out.println();
}
}
}
