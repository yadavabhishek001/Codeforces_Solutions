import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;
        for(int i = 0; i<n ; i++){
            int go = sc.nextInt();
            int come = sc.nextInt();
            
            sum -= go;
            sum += come;
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
