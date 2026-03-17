import java.util.Scanner;

class YES_and_YES_1703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i<t ; i++){
            String s = sc.next();
            
            s = s.toLowerCase();
            
            if( s.equals("yes") ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
        
        sc.close();
    }
}
