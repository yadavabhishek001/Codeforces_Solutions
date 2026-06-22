import java.util.Scanner;
 
public class AMainakAndArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
 
            int minVals = Integer.MAX_VALUE;
            int maxVals = Integer.MIN_VALUE;
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                minVals = Math.min(minVals , arr[i]);
                maxVals = Math.max(maxVals , arr[i]);
            }
 
            int ans = Integer.MIN_VALUE;
 
            ans = Math.max(ans , arr[n-1] - arr[0]);
 
            for(int i = 1; i<n ; i++){
                ans = Math.max(ans , arr[i-1] - arr[i]);
            }
            ans = Math.max(ans , maxVals - arr[0]);
            ans = Math.max(arr[n-1] - minVals , ans);
 
            System.out.println(ans);
        }
    }
}