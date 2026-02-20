import java.util.Scanner;

public class In_Search_of_an_Easy_Problem_1030A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String max = "EASY";
        for(int i = 0; i<n ; i++){
            int a = sc.nextInt();
            if(a == 1){
                max = "HARD";
                break;
            }
        }
        System.out.println(max);
    }
}
