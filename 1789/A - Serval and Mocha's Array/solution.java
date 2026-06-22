import java.util.Scanner;
 
public class AServalAndMochaSArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            long arr[] = new long[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextLong();
            }
 
            boolean found = false;
            for (int i = 0; i < n; i++) {
                for(int j = i+1; j<n ; j++){
                    if( gcd(arr[i] , arr[j]) <= 2){
                        found = true;
                    }
                }
            }
            
            if(!found){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
 
    private static long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}