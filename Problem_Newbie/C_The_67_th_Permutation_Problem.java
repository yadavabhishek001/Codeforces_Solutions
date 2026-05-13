import java.util.Scanner;

class C_The_67_th_Permutation_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int arr[] = new int[3*n];
            for(int i = 0 ; i<n*3 ; i++){
                arr[i] = i+1;
            }
            
            int ans[] = new int[3*n];

            int left = 0;
            int right = 3*n-1;

            for(int i = 3*n-1; i>=0 ; i--){
                if(i % 3 != 0){
                    ans[i] = arr[right];
                    right--;
                }
                else{
                    ans[i] = arr[left];
                    left++;
                }
            }
            for(int i = 0 ; i < 3*n ; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
