import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        while(n > 0 && count > 0){
            if(n % 10 == 0) {
                n = n/10;
            }
            else{
                n = n-1;
            }
            count--;
        }
        System.out.println(n);
    }
}