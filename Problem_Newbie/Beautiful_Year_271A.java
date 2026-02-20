import java.util.Scanner;

public class Beautiful_Year_271A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n+1;
        while(true) {
            String s = Integer.toString(n);
            if(s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2) &&
            s.charAt(2) != s.charAt(3) && s.charAt(0) != s.charAt(3) &&
            s.charAt(2) != s.charAt(0) && s.charAt(1) != s.charAt(3)){
                break;
            }
            n = Integer.parseInt(s);
            n++;
        }
        System.out.println(n);
    }
}
