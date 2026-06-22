import java.util.Scanner;
 
public class ACaseOfTheZerosAndOnes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        StringBuilder sb = new StringBuilder();
 
        for(char ch : s.toCharArray()){
            int len = sb.length();
 
            if(len > 0 && sb.charAt(len-1) != ch){
                sb.deleteCharAt(len - 1);
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.length());
 
        // int zero = 0, one = 0;
 
        // for(char c : s.toCharArray()){
        //     if(c == '0') zero++;
        //     else one++;
        // }
 
        // System.out.println(Math.abs(zero - one));
    }
}