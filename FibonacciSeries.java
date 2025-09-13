import java.util.*;
public class FibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int FirstNum = 0;
        int SecondNum = 1;
        for (int i=1;i<=range;i++){
            System.out.print(FirstNum+" ");
            int NextNum = FirstNum+SecondNum;
            FirstNum = SecondNum;
            SecondNum = NextNum;
        }System.out.println();
        sc.close();
    }
}
