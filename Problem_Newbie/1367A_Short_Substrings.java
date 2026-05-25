import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<t ; i++){
            String s = sc.next();
            
            int n = s.length();
            sb.append( s.charAt(0) );
            for(int j = 1; j<n-1 ; j++){
                if(j % 2 != 0){
                    sb.append( s.charAt(j) );
                }
            }
            sb.append(s.charAt(n-1) );
            
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}
