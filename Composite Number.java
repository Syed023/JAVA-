import java.io.*;
import java.util.*;
class rec
{
public static void main(String args[])
{
int x[] = new int[7];
Scanner s = new Scanner(System.in);
System.out.println("enter the elements:");
int count=0;
for(int i=0;i<7;i++)
{
x[i] = s.nextInt();
}
for(int i=0;i<7;i++)
{
if(isComposite(x[i]))
{
count++;
}
}
System.out.println("composite numbers are:"+count);
}
private static boolean isComposite(int n)
{
if(n<=1)
{
return false;
}
for (int i=2;i<=Math.sqrt(n);i++)
{
if(n % i == 0)
{
return true;
}
}
return false;
}
}
