import java.util.Scanner;

public class 677A_Vanya_and_Fence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int count = 0;
        for(int i = 0; i<n ; i++){
            int a = sc.nextInt();
            if(a>h){
                count += 2;
            }
            else{
                count += 1;
            }
        }
        System.out.println(count);
    }
}
