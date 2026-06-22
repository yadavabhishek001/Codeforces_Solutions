import java.util.*;
public class B_Right_Maximum {
 
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
 
        HashMap<Integer,Integer> hm = new HashMap<>();
 
        for(int i = 0; i<n ; i++){
            hm.put(arr[i] , hm.getOrDefault(arr[i], 0) + 1);
            pq.add(arr[i]);
        }
 
        int i = n-1;
        int ans = 0;
 
        while(i >= 0 && !pq.isEmpty()){
            int top = pq.peek();
 
            if(hm.get(top) == 0){
                pq.poll();
                continue;
            }
 
            if(arr[i] == top){
                ans++;
                pq.poll();
            }
 
            hm.put(arr[i] , hm.get(arr[i]) -1);
            i--;
 
        }
 
        System.out.println(ans);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
 
        sc.close();
    }
}
 