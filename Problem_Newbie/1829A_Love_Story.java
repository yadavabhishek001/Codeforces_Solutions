import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i<t ; i++){
            String s1 = sc.next();
            String s2 = "codeforces";
            
            int count = 0;
            int n = s1.length();
            
            for(int j = 0; j<n ; j++){
                if( s1.charAt(j) != s2.charAt(j) ){
                    count++;
                }
            }
            System.out.println(count);
        }
        
        sc.close();
    }
}
