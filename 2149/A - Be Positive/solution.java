import java.util.Scanner;
import java.util.ArrayList;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int zeroCount = 0;
        int moneCount = 0;
        int count = 0;
        for(int i = 0; i<n ; i++){
            int a = sc.nextInt();
            zeroCount = 0;
            moneCount = 0;
            count = 0;
            for(int j = 0; j<a ; j++){
                int a1 = sc.nextInt();
                arr.add(a1);
                if(a1 == 0){
                    zeroCount++;
                }
                else if(a1 == -1){
                    moneCount++;
                }
            }
            if(moneCount % 2 == 1){
                count += 2;
            }
            count += zeroCount * 1;
            System.out.println(count);
            
            arr.clear();
        }
    }
}