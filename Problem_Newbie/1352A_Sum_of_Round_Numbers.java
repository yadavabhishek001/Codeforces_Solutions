import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            List<Integer> result = new ArrayList<>();
            int place = 1;
            
            while (n > 0) {
                int digit = n % 10;
                
                if (digit != 0) {
                    result.add(digit * place);
                }
                
                n /= 10;
                place *= 10;
            }
            
            System.out.println(result.size());
            
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
