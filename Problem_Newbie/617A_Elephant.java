import java.util.Scanner;
public class 617A_Elephant {
    public static void main(String args[]){
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     if( n % 5 == 0){
         System.out.print(n/5);
     }
     else{
         int a = (n/5)+1;
         System.out.print(a);
     }
    }
}
