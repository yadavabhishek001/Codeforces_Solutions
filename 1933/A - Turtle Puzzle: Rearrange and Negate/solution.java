import java.util.Scanner;
 
public class ATurtlePuzzleRearrangeAndNegate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            long count = 0;
 
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                if(a < 0) a = -a;
                count += a;
            }
            System.out.println(count);
        }
    }
}