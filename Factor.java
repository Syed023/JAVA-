import java.io.*;
import java.util.*;
class mom
{
public static void main(String args[])
{
try
{
int count = 0;
int n;
System.out.println("enter n value:");
Scanner p = new Scanner(System.in);
n = p.nextInt();
for (int i=1; i<=n ;i++)
{
if (n % i == 0)
{
count++;
}
}
System.out.println("no.of factors are:"+count);
}
catch (Exception e)
{
System.out.println("invalid");
}
}
}
