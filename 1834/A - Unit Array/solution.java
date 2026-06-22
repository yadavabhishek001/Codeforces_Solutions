import java.util.Scanner;
 
public class A_Unit_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            int sum = 0;
            int prod = 1;
 
            for(int i = 0 ; i<n ; i++){
                int a = sc.nextInt();
 
                sum += a;
                prod *= a;
            }
            int count = 0;
            while( !(sum >= 0 && prod == 1) ){
                sum += 2;
                prod *= -1;
                count++;
            }
            System.out.println(count);
        }
    }
}