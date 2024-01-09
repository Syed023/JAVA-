class Degree{
void getDegree()
{
System.out.println("I got degree");
}
}
class undergraduate extends Degree{
void display()
{
System.out.println("I am an Undergraduate");
}
}
class postgraduate extends Degree{
void display()
{
System.out.println("I am an Postgraduate");
}
}
class Graduation{
public static void main(String[] args){
Degree d1=new Degree();
undergraduate d2=new undergraduate();
postgraduate d3=new postgraduate();
d1.getDegree();
d2.display();
d3.display();
}
}
