import java.util.Scanner;

public class 734A_Anton_and_Dainik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        int countA = 0;
        int countD = 0;
        for(int i = 0; i<n ; i++){
            if( str.charAt(i) == 'A' ){
                countA++;
            }
            else{
                countD++;
            }
        }
        
        if(countA>countD){
            System.out.println("Anton");
        }
        else if(countA == countD){
            System.out.println("Friendship");
        }
        else{
            System.out.println("Danik");
        }
        sc.close();
    }
}
