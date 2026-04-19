import java.util.*;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }

        String s = sc.next();
        int totalCalories = 0;

        for (char c : s.toCharArray()) {
            int index = c - '1'; // convert '1'->0, '2'->1, etc.
            totalCalories += a[index];
        }

        System.out.println(totalCalories);
    }
}
