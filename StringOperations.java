import java.util.Scanner;

class StringOperations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Length of first string: " + str1.length());
        System.out.println("Length of second string: " + str2.length());

        System.out.println("Concatenation: " + str1.concat(str2));

        if (str1.equals(str2))
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");

        System.out.println("First string in uppercase: " + str1.toUpperCase());
        System.out.println("First string in lowercase: " + str1.toLowerCase());
    }
}