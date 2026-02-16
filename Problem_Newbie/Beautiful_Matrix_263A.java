import java.util.Scanner;

public class Beautiful_Matrix_263A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int a = -1;
        int b = -1;
        for(int i = 0; i<5 ; i++){
            for(int j = 0; j<5 ; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1){
                    a = i;
                    b = j;
                }
            }
        }
        a = a - 2;
        b = b - 2;
        if(a < 0){
            a = a * (-1);
        }
        if(b < 0){
            b = b * (-1);
        }
        System.out.println(a+b);
    }
}
