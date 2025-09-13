import java.util.*;
public class TypeOfNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num==0){
            System.out.println("Entered number is zero.");
        }else if (num<0){
            System.out.println("Entered number is negative.");
        }else{
            System.out.println("Entered number is positive.");
        }sc.close();
    }
}