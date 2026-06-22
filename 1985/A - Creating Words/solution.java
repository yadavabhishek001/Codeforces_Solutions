import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i<t ; i++){
            String s1 = sc.next();
            String s2 = sc.next();
            
            Character a1 = s1.charAt(0);
            Character a2 = s2.charAt(0);
            
            s1 = s1.replaceFirst(a1 + "" , a2 + "");
            s2 = s2.replaceFirst(a2 + "" , a1 + "");
            
            System.out.println(s1 + " " + s2);
            
        }
        
        sc.close();
    }
}