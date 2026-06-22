import java.util.Scanner;
 
public class A_Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int count = 0;
        int j = 0;
        int i = 0;
        for(i = 1; count<=n ; i++){
            j += i;
            count += j;
        }
        System.out.println(i-2);
    }
}