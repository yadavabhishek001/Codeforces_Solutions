import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a % b == 0){
             System.out.println("0");
            }
            else{
                int x = a % b;
                x = b - x;
             System.out.println(x);
            }
        }
        
    }
}