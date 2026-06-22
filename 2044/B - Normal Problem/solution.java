import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String a = sc.next();
            StringBuilder b = new StringBuilder();
 
            for (int i = a.length() - 1; i >= 0; i--) {
                char ch = a.charAt(i);
 
                if (ch == 'p') {
                    b.append('q');
                } else if (ch == 'q') {
                    b.append('p');
                } else {
                    b.append('w');
                }
            }
 
            System.out.println(b);
        }
    }
}