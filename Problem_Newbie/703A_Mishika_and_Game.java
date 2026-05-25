import java.util.Scanner;

public class A_Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int countM = 0;
        int countC = 0;

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a > b){
                countM++;
            }
            else if(a < b){
                countC++;
            }
        }
        if(countM > countC){
            System.out.println("Mishka");
        }
        else if(countC > countM){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }

        sc.close();
    }
}
