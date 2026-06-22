import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<t ; i++){
            int n = sc.nextInt();
            
            for(int j = 0; j<n ; j++){
                arr.add( sc.nextInt() );
            }
            if( arr.contains(67) ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            arr.clear();
        }
        sc.close();
    }
}