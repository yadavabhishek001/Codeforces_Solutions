import java.util.Scanner;

public class C_Target_Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0
             
            char ch[][] = new char[10][10];
            int sum = 0;
            for(int i = 0; i<10 ; i++){
                
                String row = sc.next();
                for(int j = 0; j<10 ; j++){
                    
                    char a = row.charAt(j);
                    ch[i][j] = a;
                    
                    if(row.charAt(j) == 'X'){
                        int layer = Math.min(
                        Math.min(i,j), Math.min(10-1-i , 10-1-j)
                    );
                    sum += layer + 1;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
