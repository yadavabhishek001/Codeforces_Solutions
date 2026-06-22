import java.util.Scanner;
 
public class B_The_67_th_6_7_Integer_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int arr[] = new int[7];
 
            int max = Integer.MIN_VALUE;
            int idx = -1;
 
            for(int i = 0; i<7 ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] >= max){
                    max = arr[i];
                    idx = i;
                }
            }
            int ans= 0;
 
            for(int i = 0; i<7 ; i++){
                if(i != idx){
                    ans += (arr[i] * -1);
                }
                else{
                    ans += arr[i];
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}