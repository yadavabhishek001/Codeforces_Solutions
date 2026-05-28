import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();

            if (t == 1) {
                p.add(i);
            } else if (t == 2) {
                m.add(i);
            } else {
                s.add(i);
            }
        }
        int teams = Math.min(p.size(), Math.min(m.size(), s.size()));

        System.out.println(teams);

        for (int i = 0; i < teams; i++) {
            System.out.println(p.get(i) + " " + m.get(i) + " " + s.get(i));
        }
    }
}
