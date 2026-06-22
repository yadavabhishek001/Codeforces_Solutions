import java.util.Scanner;
 
public class C_Prepend_and_Append{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int a = n;
            if(n == 1){
                System.out.println(1);
                continue;
            }
            for(int i = 0; i<n/2 ; i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    a = a - 2;
                }
                else{
                    break;
                }
            }
            System.out.println(a);
        }
    }
}