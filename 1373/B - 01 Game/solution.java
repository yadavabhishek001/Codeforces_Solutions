import java.util.Scanner;
 
public class B_01_Game{
    static void solve(Scanner sc){
        String s = sc.next();
        int n = s.length();
        int count1 = 0;
 
        for(int i = 0 ; i<n ; i++){
            if(s.charAt(i) == '1'){
                count1++;
            }
        }
        int min = Math.min(n-count1, count1);
 
        if(min % 2 == 0){
            System.out.println("NET");
        }
        else{
            System.out.println("DA");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            solve(sc);
        }
        sc.close();
    }
}