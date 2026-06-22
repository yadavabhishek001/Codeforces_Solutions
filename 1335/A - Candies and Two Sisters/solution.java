import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            int a = sc.nextInt();
            if(a <= 2){
                System.out.println("0");
            }
            else{
                if(a % 2 == 0){
                    int b = (a/2) - 1;
                    System.out.println(b);
                }
                else{
                    System.out.println(a/2);
                }
            }
        }
        
    }
}