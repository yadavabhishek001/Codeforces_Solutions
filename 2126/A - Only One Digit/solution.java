import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num;
        for(int i = 0; i<t ; i++){
            int n = sc.nextInt();
            
            num = Integer.MAX_VALUE;
            
            while(n>0){
                int rem = n%10;
                if(rem < num){
                    num = rem;
                }
                n = n/10;
            }
            System.out.println(num);
        }
        sc.close();
    }
}