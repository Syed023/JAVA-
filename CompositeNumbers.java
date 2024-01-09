import java.util.Scanner;
class CompositeNumbers {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a = sc.nextInt();
System.out.print("Enter the value of b: ");
int b = sc.nextInt();
System.out.println("The composite numbers between " + a + " and " + b + " are:");
for(int i = a; i <= b; i++) {
if(isComposite(i)) {
System.out.println(i);
}
}
}
public static boolean isComposite(int n) {
if(n < 2) {
return false;
}
for(int i = 2; i < n; i++) {
if(n % i == 0) {
return true;
}
}
return false;
}
}
