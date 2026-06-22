import java.util.Scanner;
 
public class APanoramixSPrediction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
 
        int nextPrime = a1 + 1;
 
        while (true) { 
            boolean prime = true;
 
            for(int i = 2; i * i <= a2 ; i++){
                if(nextPrime % i == 0){
                    prime = false;
                    break;
                }
            }
 
            if(prime){
                break;
            }   
 
            nextPrime++;
        }
        System.out.println( nextPrime == a2 ? "YES" : "NO");
        sc.close();
    }
}