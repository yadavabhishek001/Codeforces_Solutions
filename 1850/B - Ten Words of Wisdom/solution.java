import java.util.Scanner;
 
public class BTenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            int count = 0;
            int res = 0;
 
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
 
                if(a <= 10 && b > res){
                    res = Math.max(res, b);
                    count = i+1;
                }
            }
            
            System.out.println(count);
        }
    }
}