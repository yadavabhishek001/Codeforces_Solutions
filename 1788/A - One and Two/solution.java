import java.util.Scanner;
 
public class A_One_and_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count2s = 0;
 
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 2){
                    count2s++;
                }
            }
            if(count2s == 0){
                System.out.println(1);
                continue;
            }
            if(count2s % 2 != 0){
                System.out.println(-1);
                continue;
            }
            count2s /= 2;
            int a = -1;
            for(int i = 0; i<n ; i++){
                if(arr[i] == 2){
                    count2s--;
                }
 
                if(count2s == 0){
                    a = i+1;
                    break;
                }
            }
            System.out.println(a);
        }
    }
}