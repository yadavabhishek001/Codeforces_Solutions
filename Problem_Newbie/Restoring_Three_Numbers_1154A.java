import java.util.*;
class Restoring_Three_Numbers_1154A{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int arr[] = new int[4];
     int max = 0;
     int a = -1;
     for( int i = 0; i < 4 ; i++){
         arr[i] = sc.nextInt();
         if(arr[i] > max){
             max = arr[i];
             a = i;
         }
     }
     for(int i=0 ; i<4 ; i++){
         if(i == a){
             continue;
         }
         System.out.print((max - arr[i]) + " ");
     }
        sc.close();
    }
}
