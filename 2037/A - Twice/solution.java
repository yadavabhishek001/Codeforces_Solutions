import java.util.HashMap;
import java.util.Scanner;
 
public class ATwice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            HashMap<Integer ,Integer> map = new HashMap<>();
            int count = 0;
 
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                map.put(a , map.getOrDefault(a, 0) + 1);
            }
            if(n == 1){
                System.out.println(0);
                continue;
            }
 
            for(HashMap.Entry<Integer,Integer> key : map.entrySet()){
                int a = key.getValue();
                if(a > 1){
                    count += (a / 2);
                }
            }
 
            System.out.println(count);
        }
    }
}