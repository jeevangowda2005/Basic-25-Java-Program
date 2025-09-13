import java.util.*;
public class ReverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i=num;i>0;){
            int lastdigit=i%10;
            System.out.print(lastdigit+" ");
            i/=10;
        }sc.close();

    }
}