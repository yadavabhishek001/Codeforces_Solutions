import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i<x ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int sum = a + b + c + n;
            int max = Math.max(a,Math.max(b,c));
            if(sum % 3 != 0 || max * 3 > sum){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}