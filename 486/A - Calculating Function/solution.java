import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n % 2 == 0){
         System.out.print(n/2);
        }
        else{
            long a = (-1)*(n/2) - 1 ;
            System.out.print(a);
        }
    }
}