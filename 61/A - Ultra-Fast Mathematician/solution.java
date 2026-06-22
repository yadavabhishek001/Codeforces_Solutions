import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n = a.length();
        StringBuilder xor = new StringBuilder();
        for(int i = 0; i<n ; i++){
            if(a.charAt(i) == b.charAt(i)){
                xor.append('0');
            }
            else{
                xor.append('1');
            }
        }
        System.out.println(xor.toString());
    }
}