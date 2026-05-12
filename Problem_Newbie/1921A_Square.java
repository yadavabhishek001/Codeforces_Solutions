import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int minX = 1001, maxX = -1001;

            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt(); // y not needed

                if (x < minX) minX = x;
                if (x > maxX) maxX = x;
            }

            int side = maxX - minX;
            System.out.println(side * side);
        }
    }
}
