import java.util.Scanner;
 
public class AArrivalOfTheGeneral{
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
 
        int minIdx = -1;
        int maxIdx = -1;
 
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
            if(min >= arr[i]){
                min = arr[i];
                minIdx = i;
            }
            if(max < arr[i]){
                max = arr[i];
                maxIdx = i;
            }
        }
 
        if(minIdx < maxIdx){
            System.out.println( (n-1) - minIdx + maxIdx - 1 );
        }
        else{
            System.out.println( (n-1) - minIdx + maxIdx );
        }
 
        sc.close();
    }
}