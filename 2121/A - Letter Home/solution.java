import java.util.Scanner;
 
public class ALetterHome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int pos = sc.nextInt();
 
            int arr[] = new int[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
 
            int ans = 0;
 
            if(pos <= arr[0]){
                ans = arr[n-1] - pos;
            }
            else if(pos >= arr[n-1]){
                ans = pos - arr[0];
            }
            else{
                if(pos - arr[0] <= arr[n-1] - pos){
                    ans = pos - arr[0] + ( arr[n-1] - arr[0]);
                }
                else{
                    ans = arr[n-1] - pos + arr[n-1] - arr[0];
                }
            }
            System.out.println(ans);
        }
    }
}