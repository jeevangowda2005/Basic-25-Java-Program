import java.util.*;
public class LCM{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int max = Math.max(num1,num2);
        int lcm = max;
        while(lcm%num1!=0||lcm%num2!=0){
            lcm+=max;
        }
        System.out.println("Lcm of "+num1+" & "+num2+" = "+lcm);
        sc.close();
    }
}