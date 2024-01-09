import java.util.Scanner;
class DisplayCube {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
int n = sc.nextInt();
for(int i = 1; i <= n; i++) {
System.out.println("Cube of " + i + " is: " + (i * i * i));
}
}
}
