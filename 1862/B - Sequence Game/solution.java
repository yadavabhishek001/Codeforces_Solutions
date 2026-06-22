import java.util.Scanner;
import java.util.ArrayList;
 
public class B_Sequence_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
 
 
            for(int i = 0; i<n ; i++){
                arr1.add(sc.nextInt());
            }
            arr2.add(arr1.get(0));
            for(int i = 1; i<n ; i++){
                if(arr1.get(i) < arr1.get(i-1)){
                    arr2.add(arr1.get(i));
                    arr2.add(arr1.get(i));
                }
                else{
                    arr2.add(arr1.get(i));
                }
            }
            
            System.out.println(arr2.size());
            for(int i = 0; i<arr2.size() ; i++){
                System.out.print(arr2.get(i) + " ");
            }
            System.out.println();
        }
    }    
}