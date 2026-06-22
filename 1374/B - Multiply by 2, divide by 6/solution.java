import java.util.Scanner;
 
public class B_Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            long n = sc.nextLong();
 
            int count2 = 0;
            int count3 = 0;
 
            if(n == 1){
                System.out.println(0);
                continue;
            }
            while(n >= 2){
                if(n % 2 == 0){
                    count2++;
                    n /= 2;
                }
                else if(n % 3 == 0){
                    count3++;
                    n /= 3;
                }
                else{
                    break;
                }
            }
            if(n > 1 || count2 > count3){
                System.out.println(-1);
            }
            else{
                System.out.println(count3 + (count3 - count2));
            }
        }
        sc.close();
    }
}