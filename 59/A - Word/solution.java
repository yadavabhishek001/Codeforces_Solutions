import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        
        int countU = 0;
        int countL = 0;
        for(int i = 0; i<n ; i++){
            if(Character.isUpperCase(str.charAt(i) )){
                countU++;
            }
            else{
                countL++;
            }
        }
        
        if(countU>countL){
            str = str.toUpperCase();
            System.out.println(str);
        }
        else{
            str = str.toLowerCase();
            System.out.println(str);
        }
        sc.close();
    }
}