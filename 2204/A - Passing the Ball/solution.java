import java.util.Scanner;
 
public class A_Passing_the_Ball{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            String s = sc.next();
            int count = 1;
            for(int i = 1; i<n ; i++){
                if(s.charAt(i) != 'L'){
                    count++;
                }
                else{
                    count++;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}