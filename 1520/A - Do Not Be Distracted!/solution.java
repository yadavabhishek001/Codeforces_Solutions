import java.util.HashSet;
import java.util.Scanner;
 
public class ADoNotBeDistracted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
 
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(0));
            boolean x = false;
            for(int i = 1; i<n ; i++){
                if(s.charAt(i-1) != s.charAt(i) && set.contains(s.charAt(i)) ){
                    x = true;
                    break;
                }
                set.add(s.charAt(i));
            }
            if(x) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}