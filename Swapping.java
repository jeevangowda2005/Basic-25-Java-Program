import java.util.*;
public class Swapping{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("1st number = "+num1);
        System.out.println("2nd number = "+num2);
        sc.close();
    }
}