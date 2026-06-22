import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class ABusinessTrip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        Integer arr[] = new Integer[12];
        for(int i = 0; i<12 ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr , Collections.reverseOrder());
        
        int i = 0;
        int sum = 0;
 
        for( ; i<12 ; i++){
            sum += arr[i];
            if(sum >= n){
                break;
            }
        }
        if(n == 0) i = -1;
        if(sum < n) i = -2;
        System.out.println(i+1);
    }
}