import java.util.*;
public class ReverseOrder{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i=num;i>=1;i--){
            System.out.println(i);
        }sc.close();
    }
}