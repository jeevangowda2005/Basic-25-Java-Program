import java.util.*;
public class EvenOrOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Entered number is even.");
        }else{
            System.out.println("Entered number is odd.");
        }sc.close();
    }
}