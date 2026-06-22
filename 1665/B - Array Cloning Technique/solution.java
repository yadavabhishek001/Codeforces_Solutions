import java.util.HashMap;
import java.util.Scanner;
 
public class B_Array_Cloning_Technique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            HashMap<Integer, Integer> map = new HashMap<>();
 
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
 
                map.put(a , map.getOrDefault(a, 0) + 1);
            }
 
            int currentHighestFrequency = 0;
            for(int freq : map.values()){
                currentHighestFrequency = Math.max(currentHighestFrequency, freq);
            }
            int operations = 0;
 
            while(currentHighestFrequency < n){
                operations++; // Clone
                if(2 * currentHighestFrequency <= n){ // swap
                    operations += currentHighestFrequency;
                    currentHighestFrequency *= 2;
                }
                else{
                    operations += n - currentHighestFrequency;
                    currentHighestFrequency = n;
                }
            }
            System.out.println(operations);
 
        }
 
        sc.close();
    }
}