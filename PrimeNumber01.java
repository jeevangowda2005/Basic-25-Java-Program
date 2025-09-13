import java.util.*;
public class PrimeNumber01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        for(int i=2;i<=num;i++){
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }if (isprime){
                System.out.print(i+" ");
            }
        }
    }
}