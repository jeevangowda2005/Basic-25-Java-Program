import java.util.*;

public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Entered number is not palindrome.");
        } else {
            int originalNum = num;  
            int rev = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                rev = rev * 10 + lastDigit;
                num /= 10;
            }
            if (originalNum == rev) {
                System.out.println("Entered number is palindrome.");
            } else {
                System.out.println("Entered number is not palindrome.");
            }
        }
        sc.close();
    }
}