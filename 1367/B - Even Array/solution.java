import java.util.Scanner;
 
public class BEvenArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            int countEvenPos = 0;
            int countOddPos = 0;
 
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                if(i % 2 == 0 && a % 2 != 0){
                    countEvenPos++;
                }
                else if(i % 2 != 0 && a % 2 == 0){
                    countOddPos++;
                }
            }
 
            if(countEvenPos != countOddPos){
                System.out.println(-1);
            }
            else{
                System.out.println(countEvenPos);
            }
        }
        sc.close();
    }
}