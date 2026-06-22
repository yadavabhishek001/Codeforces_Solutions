import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int count = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            int w = sc.nextInt();
            int d = sc.nextInt();
            
            count = 0;
            int x = d / w + 1;
            if( x == 1 ){
                count = n;
            }
            else if( n>x){
                while(n>0){
                count++;
                n = n - x;
                }
            }
            else{
                count = 1;
            }
            System.out.println(count);
        }
    }
}