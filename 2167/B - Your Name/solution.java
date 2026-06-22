import java.util.*;
 
public class B_Your_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
 
        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
 
            int[] freq = new int[26];
 
            // count s
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
 
            // subtract t
            for (char c : t.toCharArray()) {
                freq[c - 'a']--;
            }
 
            boolean ok = true;
            for (int x : freq) {
                if (x != 0) {
                    ok = false;
                    break;
                }
            }
 
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}