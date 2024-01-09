class Member {
String name;
int age;
String phone;
String address;
double salary;
void printSalary() {
System.out.println("The salary is: " + salary);
}
}
class Employee extends Member {
String specialization;
}
class Manager extends Member {
String department;
}
class Jobdetails{
public static void main(String[] args) {
Employee e = new Employee();
e.name = "Raj";
e.age = 25;
e.phone = "9876543210";
e.address = "Mumbai";
e.salary = 50000;
e.specialization = "Software Engineer";
Manager m = new Manager();
m.name = "Riya";
m.age = 30;
m.phone = "8765432109";
m.address = "Delhi";
m.salary = 80000;
m.department = "IT";
System.out.println("Employee details:");
System.out.println("Name: " + e.name);
System.out.println("Age: " + e.age);
System.out.println("Phone: " + e.phone);
System.out.println("Address: " + e.address);
System.out.println("Specialization: " + e.specialization);
e.printSalary();
System.out.println("Manager details:");
System.out.println("Name: " + m.name);
System.out.println("Age: " + m.age);
System.out.println("Phone: " + m.phone);
System.out.println("Address: " + m.address);
System.out.println("Department: " + m.department);
m.printSalary();
}
