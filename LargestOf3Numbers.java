import java.util.*;
public class LargestOf3Numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3 = sc.nextInt();
        if (num1>=num2){
            if (num1>=num3){
                System.out.println("Largest number is "+num1);
            }else{
                System.out.println("Largest number is "+num3);
            }
        }else{
            if (num2>=num3){
                System.out.println("Largest number is "+num2);
            }else{
                System.out.println("Largest number is "+num3);
            }
        }sc.close();
    }
}