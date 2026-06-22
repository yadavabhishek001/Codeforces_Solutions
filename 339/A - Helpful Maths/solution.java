import java.util.Arrays;
import java.util.Scanner;
 
public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        int n = s.length();
 
        int arr[] = new int[n/2 + 1];
 
        int idx = 0;
 
        if(n == 1){
            System.out.println(s);
        }
        else{
            for(int i = 0; i<n ; i++){
                if(s.charAt(i) != '+'){
                    arr[idx++] = Integer.parseInt(s.charAt(i)+"");
                }
            }
            Arrays.sort(arr);
 
            StringBuilder sb = new StringBuilder();
 
            for(int i = 0; i<arr.length; i++){
                sb.append(arr[i]);
                if(i != arr.length-1){
                    sb.append("+");
                }
            }
            System.out.println(sb.toString());
        }
    }
}