import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    while(t-- > 0){
      int n = sc.nextInt();
      int arr[] = new int[n];
      arr[0] = sc.nextInt();
      int max = arr[0];
      int min = arr[0]; 
      
      for(int i=1; i<n ; i++){
         arr[i] = sc.nextInt();
         max = Math.max(arr[i] , max);
         min = Math.min(arr[i], min);
       }
       System.out.println(max-min+1);
    }
  }
}