import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();
        int sum = 0;
        for (int i=num;i>0;){
            int lastdigit = i%10;
            int power = (int)Math.pow(lastdigit,length);
            sum+=power;
            i/=10;
        }if (sum==num){
            System.out.println("Entered number "+num+" is Armstrong");
        }else{
            System.out.println("Entered number "+num+" is not Armstrong");
        }
        sc.close();
    }
}