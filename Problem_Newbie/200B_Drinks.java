import java.util.Scanner;

public class 200B_Drinks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            int a = sc.nextInt();
            sum += a;
        }
        double x = (double) sum/n;
        System.out.printf( "%.12f%n" , x);
    }
}
