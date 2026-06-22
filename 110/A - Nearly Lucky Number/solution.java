import java.util.Scanner;
 
public class A_Nearly_Lucky_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        int count = 0;
 
        while(n != 0){
            int rem = (int) (n % 10);
            if(rem == 4 || rem == 7){
                count++;
            }
            n /= 10;
        }
        if(count == 4 || count == 7 || count == 14 || count == 17){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}