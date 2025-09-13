import java.util.*;
public class MultiplicationTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number multiplication table u need: ");
        int num = sc.nextInt();
        for (int i=1;i<=10;i++){
            int mul = i*num;
            System.out.println(num+"*"+i+"="+mul);
        }
        sc.close();
    }
}