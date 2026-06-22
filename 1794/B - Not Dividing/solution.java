import java.util.Scanner;
 
public class BNotDividing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
 
            int count = 0;
 
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                arr[i] = a;
            }
            
            for(int i = 1; i<n ; i++){
                if(arr[i-1] == 1) arr[i-1]++;
                if(arr[i] == 1) arr[i]++;
                if(arr[i] % arr[i-1] == 0){
                    arr[i]++;
                }
            }
            for(int i = 0; i<n ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}