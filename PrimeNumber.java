import java.util.*;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isprime=true;
        if (num<2){
            isprime=false;
        }else{
            for (int i=2;i<num;i++){
                if (num%i==0){
                    isprime=false;
                    break;
                }
            }
        }if (isprime){
            System.out.println("Entered number is prime i.e = "+num);
        }else{
            System.out.println("Entered number is not prime i.e = "+num);
        }sc.close();
    }
}