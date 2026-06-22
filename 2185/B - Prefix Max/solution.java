import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
            int a = sc.nextInt();
            int max = -1;
            for(int j = 0; j<a ; j++){
                int b = sc.nextInt();
                max = Math.max(max,b);
            }
            System.out.println(a*max);
        }
    }
    
}