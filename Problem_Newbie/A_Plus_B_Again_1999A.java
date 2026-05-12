import java.util.Scanner;
class A_Plus_B_Again_1999A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t ;i++){
            int a = sc.nextInt();
            int sum = 0;
            
            sum += a % 10;
            a = a/10;
            sum += a;
            
            System.out.println(sum);
        }
        sc.close();
    }
}
