import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int count = 0;
            while(n > 0){
                if(count % 3 == 0 || count % 10 == 3){
                    count++;
                    continue;
                }
                count++;
                n--;
            }
            System.out.println(count-1);
        }
    }
}
