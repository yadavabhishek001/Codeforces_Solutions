import java.util.Scanner;

public class 1850_To_my_Critics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = Math.max(a, Math.max(b,c));
            int min = Math.min(a, Math.min(b,c));

            int mid = -1;

            if((max == a && min == b) || (max == b && min == a)){
                mid = c;
            }
            else if((max == b && min == c) || (max == c && min == b)){
                mid = a;
            }
            else{
                mid = b;
            }

            if(max + mid >= 10){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
