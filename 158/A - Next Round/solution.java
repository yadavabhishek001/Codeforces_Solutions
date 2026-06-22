import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        int count = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];
        int ele = Integer.MIN_VALUE;
        
        for(int i = 0; i<a ; i++){
            arr[i] = sc.nextInt();
            if( ( i+1) == b ){
                ele = arr[i];
            }
        }
        for(int i = 0; i<a ; i++){
            if( arr[i] > 0 && arr[i] >= ele){
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}