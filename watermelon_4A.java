import java.util.Scanner;

public class watermelon_4A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n%2 == 0 && n>2 ? "Yes" : "No");
    }
}