import java.util.Scanner;
 
public class CCypher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
 
            int ops = 0;
            for(int i = 0; i<n ; i++){
                int x = sc.nextInt();
                String str = sc.next();
 
                for(int j = 0; j<x ; j++){
                    if(str.charAt(j) == 'D'){
                        arr[i] =  ( arr[i] + 1 ) % 10;
                    }
                    else{
                        arr[i] = ( arr[i] - 1 );
                        if(arr[i] == -1) arr[i] = 9;
                    }
                }
            }
            for(int i = 0; i<n ; i++){
                System.out.print(arr[i] + " ");
            }
 
            System.out.println();
        }
    }
}