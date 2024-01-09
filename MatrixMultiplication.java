import java.util.Scanner;
class MatrixMultiplication {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int rows1, cols1, rows2, cols2;
System.out.println("Enter the number of rows and columns of the first matrix:");
rows1 = sc.nextInt();
cols1 = sc.nextInt();
System.out.println("Enter the number of rows and columns of the second matrix:");
rows2 = sc.nextInt();
cols2 = sc.nextInt();
if(cols1 != rows2) {
System.out.println("Matrix multiplication is not possible");
return;
}
int[][] mat1 = new int[rows1][cols1];
int[][] mat2 = new int[rows2][cols2];
int[][] product = new int[rows1][cols2];
System.out.println("Enter the elements of the first matrix:");
for(int i = 0; i < rows1; i++) {
for(int j = 0; j < cols1; j++) {
mat1[i][j] = sc.nextInt();
}
}
System.out.println("Enter the elements of the second matrix:");
for(int i = 0; i < rows2; i++) {
for(int j = 0; j < cols2; j++) {
mat2[i][j] = sc.nextInt();
}
}
for(int i = 0; i < rows1; i++) {
for(int j = 0; j < cols2; j++) {
for(int k = 0; k < cols1; k++) {
product[i][j] += mat1[i][k] * mat2[k][j];
}
}
}
System.out.println("The product matrix is:");
for(int i = 0; i < rows1; i++) {
for(int j = 0; j < cols2; j++) {
System.out.print(product[i][j] + " ");
}
System.out.println();
}
}
}
