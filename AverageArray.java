class AverageArray {
public static void main(String[] args) {
int[] numbers = {10, 20, 30, 40, 50};
int sum = 0;
for (int number : numbers) {
sum += number;
}
double average = (double) sum / numbers.length;
System.out.println("The average value of the array elements is " + average);
}
}
