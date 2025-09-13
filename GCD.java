import java.util.*;
public class GCD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2= sc.nextInt();
        while(num1!=num2){
            if (num1>num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
        }System.out.println("GCD = "+num2);
        sc.close();
    }
}
