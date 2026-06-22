import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int count = 0;
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                arr.add( a );
            }
            boolean flag = false;
            for(int i = 1; i<n ; i++){
                if(arr.get(i) - arr.get(i-1) < 0 ){
                    
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                System.out.println("1");
            }
            else{
                System.out.println(arr.size());
            }
            arr.clear();
        }
    }
}