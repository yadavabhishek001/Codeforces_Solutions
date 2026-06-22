import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
 
public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            HashMap<Integer,Integer> map = new HashMap<>();
 
 
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                map.put(a , map.getOrDefault(a , 0) + 1);
            }
            ArrayList<Integer> arr = new ArrayList<>(map.values());
            if(map.size() > 2){
                System.out.println("No");
            }
            else if(map.size() == 1 ){
                System.out.println("Yes");
            }
            else{
                if(n % 2 == 0 && arr.get(0) == arr.get(1)){
                    System.out.println("Yes");
                }
                else if(n % 2 == 1 && Math.abs(arr.get(0) - arr.get(1) ) == 1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
 
            map.clear();
        }
    }
}