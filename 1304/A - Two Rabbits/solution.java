import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int count = 0;
        while(t-- > 0){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int stepP = sc.nextInt();
            int stepN = sc.nextInt();
            
            int x = end - start;
            int y = stepP + stepN;
            
            if(x % y == 0){
                System.out.println(x/y);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}