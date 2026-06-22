import java.util.*;
public class sol1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int count = 0;
            int max = 0;
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                max = Math.max(max,a);
                arr.add( a );
            }
            for(int i = 0; i<n ; i++){
                if(arr.get(i) == max){
                    count++;
                }
            }
            System.out.println(count);
            arr.clear();
        }
    }
}