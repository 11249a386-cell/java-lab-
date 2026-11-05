public class LargestSmallest {
    public static void main(String[] args) {
        int[] a = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};
        int sum = 0, min = a[0], max = a[0];
        for (int value : a) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
