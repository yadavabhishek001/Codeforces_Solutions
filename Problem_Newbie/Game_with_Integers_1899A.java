import java.util.Scanner;

public class Game_with_Integers_1899A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println( n%3 != 0 ? "First" : "Second" );
        }
        sc.close();
    }
}
