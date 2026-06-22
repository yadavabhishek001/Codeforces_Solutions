import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        
        while(t-- > 0){
            long a = sc.nextLong();
            String s = String.valueOf(a);
            int n = s.length();
            ArrayList<Integer> arr = new ArrayList<>();
            
            int sum = 0;
            for(int i = 0; i<n ; i++){
                arr.add(s.charAt(i) - '0');
                sum += s.charAt(i) - '0';
            }
            if(sum<10){
                System.out.println(0);
                continue;
                
            }
            int count = 0;
            if(arr.get(0) != 1){
                arr.set(0 , arr.get(0) - 1);
            }
            n = arr.size();
            Collections.sort(arr , Collections.reverseOrder());
            for(int i = 0 ; i<n ;i++){
                sum = sum - arr.get(i);
                count++;
                if(sum<10){
                    break;
                }
            }
            System.out.println(count);
        }
    }
 
}