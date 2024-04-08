import java.io.*;
import java.util.*;
class mom
{
public static void main(String args[])
{
try
{
int fact = 1;
int n=5;
int i=1;
while(i<=n)
{
fact = fact * i;
i++;
}
System.out.printf("factorial of %d = %d",n ,fact);
}
catch (Exception e)
{
System.out.println("invalid");
}
}
}
