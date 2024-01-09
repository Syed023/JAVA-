import java.util.Scanner;
class InvertedPyramid {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the height of the pyramid: ");
int height = sc.nextInt();
for(int i = height; i >= 1; i--) {
for(int j = 1; j <= height - i; j++) {
System.out.print(" ");
}
for(int k = 1; k <= 2 * i - 1; k++) {
System.out.print("*");
}
System.out.println();
}
}
}
