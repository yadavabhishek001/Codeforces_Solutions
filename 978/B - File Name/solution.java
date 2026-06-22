import java.util.Scanner;
 
public class BFileName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        int ans = 0;
        for(int i = 1; i<n-1 ; i++){
            if( s.charAt(i-1) == 'x' &&  s.charAt(i) == 'x' && s.charAt(i+1) == 'x' ){
                ans++;
            }
        }
        System.out.println(ans);
    }
}