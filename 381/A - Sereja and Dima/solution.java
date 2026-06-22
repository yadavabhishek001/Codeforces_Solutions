import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int l = 0, r = n - 1;
        int sereja = 0, dima = 0;
        boolean turn = true; // true = Sereja, false = Dima
 
        while (l <= r) {
            int picked;
 
            if (a[l] > a[r]) {
                picked = a[l];
                l++;
            } else {
                picked = a[r];
                r--;
            }
 
            if (turn) {
                sereja += picked;
            } else {
                dima += picked;
            }
 
            turn = !turn; // switch turn
        }
 
        System.out.println(sereja + " " + dima);
    }
}