import java.util.Scanner;
 
public class A_Desorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
 
            int minDiff = Integer.MAX_VALUE;
            boolean unsorted = false;
 
            for(int i = 0; i < n-1; i++){
                if(a[i] > a[i+1]){
                    unsorted = true;
                }
                minDiff = Math.min(minDiff, a[i+1] - a[i]);
            }
 
            if(unsorted){
                System.out.println(0);
            }else{
                System.out.println(minDiff/2 + 1);
            }
        }
    }
}