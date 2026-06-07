import java.util.Scanner;

public 1669A_class Division {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t ;i++){
            int a = sc.nextInt();
            
            if(a <= 1399){
                System.out.println("Division 4");
            }
            else if(a <= 1599  && a >= 1400){
                System.out.println("Division 3");
            }
            else if(a <= 1899 && a >= 1600){
                System.out.println("Division 2");
            }
            else
            {
                System.out.println("Division 1");
            }
            
        }
        sc.close();
    }
}
