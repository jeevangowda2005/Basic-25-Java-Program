import java.util.*;
public class NumberOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = 0;
        if (num==0){
            count=1;
        }else{
            for (int i=num;i>0;){
                count++;
                i/=10;
            }
        }
        System.out.println("Number of digits = "+count);
        sc.close();
    }
}