import java.util.Scanner;

public class B_Blank_Space{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int arr[] = new int[n];
            int count = 0;
            int max = 0;
            int prev = -1;
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            if(n == 1 && arr[0] == 0){
                System.out.println(1);
                continue;
            }
            else if(n==1 && arr[0] == 1){
                System.out.println(0);
                continue;
            }
            else{
                for(int i = 0; i<n ; i++){
                    if(i>0 && arr[i-1] == 0 && arr[i] == 0 ){
                        count++;
                    }
                    else if(arr[i] == 0){
                        count = 1;
                    }
                    else{
                        count = 0;
                    }
                    prev = arr[i];
                    max = Math.max(max, count);
                }
                System.out.println(max);
            }
        }
    }
}
