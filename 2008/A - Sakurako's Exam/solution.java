import java.util.Scanner;
 
public class ASakurakoSExam{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int count1 = sc.nextInt();
            int count2 = sc.nextInt();
 
            count2 %= 2;
            if(count1 != 0 && count1 % 2 == 0){
                System.out.println("YES");
            }
            else if(count1 ==  0 && count2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}