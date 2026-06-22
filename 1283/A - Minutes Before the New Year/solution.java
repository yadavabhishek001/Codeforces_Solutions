import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int h = 23 - a;
            int m = 60 - b;
            int total = 60*h + m;
            System.out.println(total);
        }
    }
}