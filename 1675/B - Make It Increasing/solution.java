import java.util.Scanner;
 
public class BMakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
 
            int count = 0;
            boolean notPos = false;
 
            for(int i = n-2 ; i>=0 ; i--){
                while(arr[i] >= arr[i+1]){
                    if(arr[i] == 0 && arr[i+1] == 0){
                        notPos = true;
                        break;
                    }
                    arr[i] /= 2;
                    count++;
                }
                if(notPos) break;
                
            }
            if(!notPos) System.out.println(count);
            else System.out.println(-1);
        }
    }
}