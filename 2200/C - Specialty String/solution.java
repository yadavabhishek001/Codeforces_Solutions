import java.util.*;
 
public class sol3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int count = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            int n1 = n;
            
            for(int i = 1; i<n1 ; i++){
                if(sb.charAt(i) == sb.charAt(i-1) ){
                    sb = sb.deleteCharAt(i);
                    sb = sb.deleteCharAt(i-1);
                    i = 0;
                    n1 = n1-2;
                }
            }
            if(sb.length() == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            sb.setLength(0);
        }
    }
}