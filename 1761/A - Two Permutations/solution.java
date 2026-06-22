import java.util.Scanner;
 
public class A_Two_Permutations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            if(a == b && n == a){
                System.out.println("Yes");
            }
            else if(n - (a+b) >= 2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}