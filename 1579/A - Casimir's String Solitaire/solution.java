import java.util.Scanner;
import java.util.HashMap;
 
public class ACasimirSStringSolitaire{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
 
            int countA = 0, countB = 0, countC = 0;
 
            for(int i = 0; i<n ; i++){
                char ch = s.charAt(i);
                if(ch == 'A') countA++;
                else if(ch == 'B') countB++;
                else countC++;
            }
            if(countB == countA + countC) System.out.println("YES");
            else System.out.println("NO");
 
        }
    }
}