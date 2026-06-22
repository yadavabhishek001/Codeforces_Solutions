import java.util.Scanner;
import java.util.Arrays;
 
public class D_Balanced_Round{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int arr[] = new int[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
 
            int count = 0;
            int maxCount = 0;
 
            for(int i = 1; i<n ; i++){
                if(arr[i] - arr[i-1] <= k){
                    count++;
                }
                else{
                    count = 0;
                }
                maxCount = Math.max(maxCount,count);
            }
            System.out.println(n-maxCount-1);
        }
    }
}