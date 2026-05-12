import java.util.Scanner;

public class Halloumi_Boxes_1903A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean flag = true;
            int prev = -1;
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                if(i>=1 && prev > a ){
                    flag = false;
                }
                prev = a;
            }
            if( flag && k == 1 ){
                System.out.println("YES");
            }
            else if(k > 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
