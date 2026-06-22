import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int count = 1;
        for(int i = 1; i<n ; i++){
            String b = sc.next();
            if(a.equals(b)){
                continue;
            }
            else{
                count++;
            }
            a = b;
        }
        System.out.println(count);
    }
}