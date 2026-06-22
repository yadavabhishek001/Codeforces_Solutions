import java.util.Scanner;
 
public class B_Comparison_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
 
            int countR = 1;
            int countL = 1;
 
            int maxCount = Integer.MIN_VALUE;
            char prev = 'x';
            for(int i = 0; i<n ; i++){
                char ch = s.charAt(i);
                if(i>0 && prev == '<' && ch == '<'){
                    countR++;
                }
                else if(i>0 && prev == '>' && ch == '>'){
                    countL++;
                }
                else{
                    countL = 1;
                    countR = 1;
                }
                prev = ch;
                maxCount = Math.max(maxCount , Math.max(countL,countR));
            }
            System.out.println(maxCount+1);
        }
    }
}