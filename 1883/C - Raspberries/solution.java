import java.util.Scanner;
 
public class CRaspberries{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int arr[] = new int[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            } 
 
            int ans = Integer.MAX_VALUE;
            int evenCount = 0;
 
            for(int i = 0; i<n ; i++){
                if(arr[i] % 2 == 0) evenCount++;
                if(arr[i] % x == 0) ans = 0;
                ans = Math.min(ans , (x - arr[i] % x));
            }
 
            if(x == 4){
                if(evenCount >= 2) ans = Math.min(ans , 0);
                else if(evenCount == 1) ans = Math.min(ans , 1);
                else if(evenCount == 0) ans = Math.min(ans , 2);
            }
            System.out.println(ans);
        }
    }
}