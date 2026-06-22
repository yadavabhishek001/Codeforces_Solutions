import java.util.Scanner;
 
public class BTatarTvShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
 
            char ch[] = s.toCharArray();
 
            for(int i = 0; i<n-k ; i++){
                if(ch[i] == '1'){
                    ch[i] = '0';
 
                    if( ch[i+k] == '0' ){
                        ch[i+k] = '1';
                    }
                    else{
                        ch[i+k] = '0';
                    }
                }
            }
            
            boolean foundOne = false;
 
            for(int i = n-k ; i<n; i++){
                if(ch[i] == '1'){
                    foundOne = true;
                    break;
                }
            }
 
            if(foundOne){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
        }
    }
}