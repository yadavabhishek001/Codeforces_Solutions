import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i<a ; i++){
            int n = sc.nextInt();
            int evenCount = 0;
            int oddCount = 0;
            for(int j = 0; j<2*n ; j++){
                int x = sc.nextInt();
                if(x % 2 == 0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
            if( evenCount == oddCount ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}