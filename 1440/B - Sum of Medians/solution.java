import java.util.Scanner;
 
public class B_Sum_of_Medians{
    static void solve(Scanner sc){
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        long arr[] = new long[n*k];
 
        for(int i = 0; i<n*k ; i++){
            arr[i] = sc.nextInt();
        }
 
        long sum = 0;
        int pointer = n*k;
 
        while(k-- > 0){
            pointer -= (n/2) + 1;
            
            sum += arr[pointer];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            solve(sc);
        }
        sc.close();
    }
}