import java.util.Scanner;

public class 1873C_Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                String s = sc.next();

                for (int j = 0; j < 10; j++) {
                    if (s.charAt(j) == 'X') {

                        if (i == 0 || i == 9 || j == 0 || j == 9)
                            score += 1;

                        else if (i == 1 || i == 8 || j == 1 || j == 8)
                            score += 2;

                        else if (i == 2 || i == 7 || j == 2 || j == 7)
                            score += 3;

                        else if (i == 3 || i == 6 || j == 3 || j == 6)
                            score += 4;

                        else
                            score += 5;
                    }
                }
            }

            System.out.println(score);
        }
    }
}
