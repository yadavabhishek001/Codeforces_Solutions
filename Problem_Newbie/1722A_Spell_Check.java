import java.util.HashSet;
import java.util.Scanner;
 
public class A_Spell_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
 
            HashSet<Character> set = new HashSet<>();
            
            set.add('T');
            set.add('i');
            set.add('m');
            set.add('u');
            set.add('r');
 
            if(n != 5){
                System.out.println("NO");
                continue;
            }
            for(int i = 0; i<5 ; i++){
                if(set.contains(s.charAt(i))){
                    set.remove(s.charAt(i));
                }
                else{
                    break;
                }
            }
            if(set.size() == 0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
