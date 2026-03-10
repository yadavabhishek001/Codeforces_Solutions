import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<n ;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a <= b-2){
               sum++; 
            }
        }
        System.out.println(sum);
    }
}
