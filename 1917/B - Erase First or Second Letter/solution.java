import java.util.HashMap;
import java.util.Scanner;
 
public class B_Erase_First_or_Second_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
 
            int count = 0;
            int ans = 0;
            
            HashMap<Character, Integer> map = new HashMap<>();
 
            for(int i = 0; i<n ; i++){
                char ch = s.charAt(i);
 
                map.put(ch , map.getOrDefault(ch, 0) + 1);
                if(map.get(ch) == 1){
                    count++;
                }
                ans += count;
            }
 
            System.out.println(ans);
        }
        sc.close();
    }
}