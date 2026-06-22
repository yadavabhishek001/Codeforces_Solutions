import java.util.Scanner;
 
public class  A_Make_it_White{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
 
            int left = 0, right = n-1;
            int x = 0;
            while(x != n && left < right){
                if(s.charAt(left) == 'W'){
                    left++;
                }
                if(s.charAt(right) == 'W'){
                    right--;
                }
                x++;
            }
            System.out.println(right - left + 1);
        }
        sc.close();
    }
}