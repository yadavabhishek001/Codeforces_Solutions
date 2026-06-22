import java.util.Scanner;
 
public class B_Good_Kid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            int arr[] = new int[n];
            int x = Integer.MAX_VALUE;
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                x = Math.min(x , arr[i]);
            }
 
            int prod = 1;
            int count = 1;
            for(int i = 0; i<n ; i++){
                if(count > 0 && arr[i] == x){
                    arr[i] = x+1;
                    count--;
                }
                prod *= arr[i];
            }
            System.out.println(prod);
        }
    }
}