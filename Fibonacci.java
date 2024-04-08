import java.io.*;
import java.util.*;
class mom
{
public static void main(String args[])
{
try
{
int i=1;
int firstterm = 0;
int secondterm = 1;
int n=10;
while (i<=n)
{
System.out.println(firstterm);
int nextterm = firstterm + secondterm;
firstterm = secondterm;
secondterm = nextterm;
i++;
}
}
catch (Exception e)
{
System.out.println("invalid");
}
}
}
