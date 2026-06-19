import java.util.Scanner;
public class 1900A_Cover_in_Water{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            char prev = s.charAt(0);
            int count = 0;
            int sum = 0;
            int maxCount = 0;
            for(int i = 0 ; i<n ; i++){
                char ch = s.charAt(i);
                if( (i>0 && prev == '.' && ch == '.') || ch == '.' ){
                    count += 1;
                    sum += 1;
                }
                else{
                    count = 0;
                }
                maxCount = Math.max(maxCount, count);
                prev = ch;
            }
            if(maxCount>2){
                System.out.println("2");
            }
            else{
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
