import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<n ; i++){
            set.add(s.charAt(i));
        }
        int x = set.size();
        
        if(x % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}