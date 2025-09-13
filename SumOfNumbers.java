import java.util.*;
public class SumOfNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i=num;i>0;){
            int digit = i%10;
            sum+=digit;
            i/=10;
        }System.out.println("Sum of "+num+" = "+sum);
        sc.close();
    }
}