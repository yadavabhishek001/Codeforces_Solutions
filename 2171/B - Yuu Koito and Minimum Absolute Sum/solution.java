import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i<t ; i++){
            int n = sc.nextInt();
            
            for(int j = 0 ;j < n ;j++){
                arr.add( sc.nextInt() );
            }
            
            int an = arr.get( arr.size()-1 );
            int a1 = arr.get(0);
            
            if(a1 == -1 && an == -1){
                an = 0;
                a1 = 0;
            }
            else if(a1 == -1){
                a1 = an;
            }
            else if(an == -1){
                an = a1;
            }
            
            int diff = Math.abs(an - a1);
            System.out.println(diff);
            
            arr.set( arr.size()-1 , an);
            arr.set( 0 , a1);
            
            for(int j = 0 ;j < arr.size() ;j++){
                if( arr.get(j) == -1 ){
                    arr.set(j , 0);
                }
            }
            
            for(int j = 0; j<arr.size() ; j++){
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
            arr.clear();
        }
        sc.close();
    }
}