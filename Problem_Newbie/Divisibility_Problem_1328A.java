import java.util.Scanner;

class Divisibility_Problem_1328A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a % b == 0){
             System.out.println("0");
            }
            else{
                int x = a % b;
                x = b - x;
             System.out.println(x);
            }
        }
        sc.close();
        
    }
}
