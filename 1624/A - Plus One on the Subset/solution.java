import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int j = 0; j<a ; j++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println(max - min);
        }
    }
}