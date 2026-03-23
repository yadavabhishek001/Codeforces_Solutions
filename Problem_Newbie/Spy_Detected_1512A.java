import java.util.Scanner;

public class Spy_Detected_1512A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t ;i++){
            int n = sc.nextInt();
            int arr[] = new int[100];
            
            for(int j = 0; j<n ; j++){
                arr[j] = sc.nextInt();
            }
            int same = -1;
            if(arr[0] == arr[1]){
                same = arr[0];
            }
            else if(arr[0] == arr[2]){
                same = arr[0];
            }
            else{
                same = arr[1];
            }
            
            for(int j = 0; j<n ; j++){
                if(arr[j] != same){
                    System.out.println(j+1);
                    break;
                }
            }
            arr = null;
        }
        sc.close();
    }
}
