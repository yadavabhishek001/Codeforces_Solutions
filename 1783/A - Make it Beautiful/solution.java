import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class AMakeItBeautiful{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            Integer arr[]  =new Integer[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
 
            Arrays.sort(arr , Collections.reverseOrder());
 
            if(arr[0] == arr[n-1]){
                System.out.println("NO");
                continue;
            }
            else{
                if(arr[0] == arr[1]){
                    int temp = arr[1];
                    arr[1] = arr[n-1];
                    arr[n-1] = temp;
                }
                System.out.println("YES");
                for(int i = 0; i<n ; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}