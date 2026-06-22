import java.util.Scanner;
 
public class BMakeEqual{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
 
            int avg = sum / n;
            int extraVals = 0;
 
            if(n == 1){
                System.out.println("YES");
            }
            else{
                for(int i = 0; i<n ; i++){
                    if(arr[i] >= avg){
                        extraVals = extraVals + (arr[i] - avg);
                    }
                    else if(extraVals > 0 && arr[i] < avg ){
                        
                        if(extraVals >= (avg - arr[i])){
                            extraVals -= (avg - arr[i]);
                        }
                    }
                }
                if(extraVals == 0) System.out.println("YES");
                else System.out.println("NO");
            }
            
 
        }
    }
}