import java.util.Scanner;

class A_Buttons{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int bSum = b + c/2;
            int aSum = a + (c - c/2);

            if(aSum > bSum){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }
            
        }
        sc.close();
    }
}