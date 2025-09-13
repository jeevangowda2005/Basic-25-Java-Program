import java.util.*;
public class Addition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st num = ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd num = ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Addition : "+sum);
        sc.close();
    }
}