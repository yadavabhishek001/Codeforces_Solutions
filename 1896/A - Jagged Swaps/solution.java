import java.util.Arrays;
import java.util.Scanner;
 
public class A_Jagged_Swaps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int firstElement = -1;
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                if(i == 0){
                    firstElement = a;
                }
            }
            if(firstElement == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}