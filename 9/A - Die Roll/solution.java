import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        if(a>b){
            for(int i = a ; i<=6 ; i++){
                count++;
            }
        }
        else{
            for(int i = b; i<=6 ; i++){
                count++;
            }
        }
        int c = 6;
        for(int i = 2; i<=6 ;i++){
            if(count % i == 0 && 6 % i == 0){
                count = count / i;
                c = c/i;
            }
        }
        System.out.println(count +"/" + c);
        sc.close();
    }
}