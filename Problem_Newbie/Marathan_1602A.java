import java.util.Scanner;

class Marathan_1602A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        for(int i = 0; i<t ;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            count = 0;
            if(b>a){
                count++;
            }
            if(c>a){
                count++;
            }
            if(d>a){
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
