import java.util.Scanner;
 
public class A_AvtoBus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            
            long n = sc.nextLong();
 
            long min = 0;
            long max = 0;
 
            if( n < 4 || (n % 2 != 0) ){
                System.out.println(-1);
                continue;
            }
 
            if(n % 4 == 0 && n % 6 == 0){
                min = n / 6;
                max = n / 4;
 
            }
            else if(n % 4 != 0 && n % 6 != 0){
                min = (n / 6) + 1;
                max = n / 4;
            }
            else{
                if(n % 4 == 0){
                    max = n / 4;
                    min = (n / 6) + 1;
                }
                else{
                    min = n / 6;
                    max = n / 4;
                }
            }
            System.out.println(min + " " + max);
        }
        sc.close();
    }
}