import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String str1 = sc.next();
        int n = str1.length();
        int n1 = str.length();
        
        if(n1 != n){
            System.out.println("NO");
            return;
        }
        
        int j =0;
        for(int i = n-1; i>=0 ; i--){
            if( str1.charAt(i) != str.charAt(j) ){
                System.out.println("NO");
                return;
            }
            j++;
        }
        System.out.println("YES");
        sc.close();
    }
}