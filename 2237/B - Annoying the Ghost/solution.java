import java.util.Scanner;
 
public class BAnnoyingTheGhost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            long n = sc.nextInt();
            long arr1[] = new long[(int)(n)];
            long arr2[] = new long[(int)(n)];
 
            for(int i = 0; i<n ; i++){
                arr1[i] = sc.nextLong();
            }
            for(int i = 0; i<n ; i++){
                arr2[i] = sc.nextLong();
            }
 
            boolean possible = true;
            long ans = 0;
            for(int i = 0; i<n ; i++){
                long a = arr2[i];
                int place = -1;
                for(int j = i; j<n ; j++){
                    long b = arr1[j];
                    if(a >= b){
                        place = j;
                        break;
                    }
                }
                if(place == -1){
                    possible = false;
                    break;
                }
                long temp = arr1[place];
                for(int j = place-1; j>=i ; j--){
                    arr1[j+1] = arr1[j];
                    ans++;
                }
                arr1[i] = temp;
            }
 
            if(!possible){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }
        }
    }
}