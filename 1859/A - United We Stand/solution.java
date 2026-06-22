import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class A_United_We_Stand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
 
            int max = -1;
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                max = Math.max(max,arr[i]);
            }
            boolean x = false;
            for(int i = 1; i<n ; i++){
                if(arr[i] != arr[i-1]){
                    x = true;
                    break;
                }
            }
            if(!x){
                System.out.println(-1);
                continue;
            }
            
            for(int i = 0;i<n ; i++){
                if(arr[i] != max){
                    arr1.add(arr[i]);
                }
                else{
                    arr2.add(arr[i]);
                }
            }
            System.out.print(arr1.size() + " ");
            System.out.println(arr2.size());
 
            for(int a : arr1){
                System.out.print(a + " ");
            }
            System.out.println();
            for(int i : arr2){
                System.out.print(i + " ");
            }
            System.out.println();
 
        }
        sc.close();
    }
}