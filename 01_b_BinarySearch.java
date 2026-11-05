import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements in ascending order:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int first = 0, last = n - 1, found = -1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (a[mid] == x) { found = mid; break; }
            if (a[mid] < x) first = mid + 1;
            else last = mid - 1;
        }
        System.out.println(found >= 0 ? "Element found" : "Element not found");
    }
}
