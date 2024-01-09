import java.util.Arrays;
class ArrayConcat {
public static int[] concat(int[] a, int[] b) {
int[] result = new int[a.length + b.length];
System.arraycopy(a, 0, result, 0, a.length);
System.arraycopy(b, 0, result, a.length, b.length);
return result;
}
public static void main(String[] args) {
int[] array1 = {1, 2, 3};
int[] array2 = {4, 5, 6};
int[] array3 = concat(array1, array2);
System.out.println(Arrays.toString(array3));
}
}
