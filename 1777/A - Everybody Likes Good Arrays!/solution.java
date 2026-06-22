import java.util.Scanner;
 
public class A_Everybody_Likes_Good_Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            int count = 0;
            int prev = sc.nextInt();
            for(int i = 1; i<n; i++){
                int a = sc.nextInt();
                if( (prev % 2 == 0 && a % 2 == 0) || (prev % 2 != 0 && a % 2 != 0) ){
                    count++;
                }
                prev = a;
            }
            System.out.println(count);
        }
    }
}