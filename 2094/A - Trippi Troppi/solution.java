import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String s = "";
        
        for(int i = 0; i<t ; i++){
            String s1 = sc.nextLine();
            int n = s1.length();
            s = s + s1.charAt(0);
            
            for(int j = 1; j<n ; j++){
                if( s1.charAt(j-1) == (' ') ){
                    s = s + s1.charAt(j);
                }
            }
            System.out.println(s);
            s = "";
        }
        sc.close();
    }
}