import java.util.Scanner;
 
public class A_Red_Versus_Blue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
 
            StringBuilder sb = new StringBuilder("");
 
            int base = r / (b+1) ;
            int extra = r % (b+1);
 
            for(int i = 0; i<b+1 ; i++){
                int redCount = base;
                if(extra > 0){
                    redCount++;
                    extra--;
                }
 
                for(int j = 0; j<redCount ; j++){
                    sb.append("R");
                }
 
                if(i < b){
                    sb.append("B");
                }
            }
            System.out.println(sb.toString());
 
        }
    }
}