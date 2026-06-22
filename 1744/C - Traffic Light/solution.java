import java.util.Scanner;
 
public class C_Traffic_Light{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
 
            String s = sc.next();
            if(ch == 'g'){
                System.out.println(0);
                continue;
            }
            String str = s+s;
 
            int maxDist = 0;
            int nextGreen = -1;
 
            for(int i = 2*n-1; i>=0 ; i--){
                if(str.charAt(i) == 'g'){
                    nextGreen = i;
                }
 
                if(str.charAt(i) == ch){
                    maxDist = Math.max(maxDist, nextGreen-i);
                }
            }
            System.out.println(maxDist);
        }
    }
}