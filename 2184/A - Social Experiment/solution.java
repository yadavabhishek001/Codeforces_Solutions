import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i<t ; i++){
            int n = sc.nextInt();
            
            if(n<4){
                System.out.println(n);
            }
            else if(n % 2 == 0){
                System.out.println("0");
            }
            else if(n%2 != 0){
                System.out.println("1");
            }
        }
        sc.close();
    }
}