import java.util.Scanner;
 
public class APolycarpAndTheDayOfPi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            String s = sc.next();
            String equal = "314159265358979323846264338327";
 
            int count = 0;
 
            for(int i = 0; i< s.length() ; i++){
                if(s.charAt(i) != equal.charAt(i)){
                    break;
                }
                count++;
            }
 
            System.out.println(count);
        }
    }
}