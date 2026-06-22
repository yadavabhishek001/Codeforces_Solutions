import java.util.Scanner;
 
public class ACombinationLock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
        String res = sc.next();
 
        int count = 0;
 
        for(int i = 0; i<n ; i++){
            int a = Integer.parseInt(s.charAt(i) + "");
            int b = Integer.parseInt(res.charAt(i) + "");
            int diff = Math.abs(a-b);
            if( diff >= 5){
                count += ( 10-diff );
            }
            else{
                count += diff;
            }
        }
        System.out.println(count);
    }
}