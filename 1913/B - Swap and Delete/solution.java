import java.util.Scanner;
 
public class B_Swap_and_Delete{
    public static void solve(Scanner sc){
        String s = sc.next();
        int n = s.length();
 
        int count1 = 0;
		int count0 = 0;
 
        for(int i = 0; i<n ; i++){
            if(s.charAt(i) == '1'){
                count1++;
            }
			else{
				count0++;
			}
        }
 
		int length = 0;
 
		for(int i = 0; i<n ; i++){
			if(s.charAt(i) == '0' && count1 > 0){
				count1--;
				length++;
			}
			else if(s.charAt(i) == '1' && count0 > 0){
				count0--;
				length++;
			}
			else{
				break;
			}
		}
		System.out.println(n-length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            solve(sc);
        }
    }
}