import java.util.Scanner;

public class How_Much_Does_Daytona_Cost_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            boolean flag = false;
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
 
                if(a == x){
                    flag = true;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
