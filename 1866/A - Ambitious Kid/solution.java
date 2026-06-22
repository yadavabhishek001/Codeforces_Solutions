import java.util.Scanner;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
            int a = sc.nextInt();
            
            a = Math.abs(a);
            
            min = Math.min(min , a);
        }
        System.out.print(min);
    }
}