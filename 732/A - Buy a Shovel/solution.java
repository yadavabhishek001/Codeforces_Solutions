import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
 
        int n = 1;
        while (true) {
            int lastDigit = (n * k) % 10;
            if (lastDigit == 0 || lastDigit == r) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}