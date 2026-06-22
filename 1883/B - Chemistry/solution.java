import java.util.Scanner;
 
public class BChemistry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
 
            String s = sc.next();
 
            int[] frequencyOfCharacters = new int[26];
			for (int i = 0; i < n; i++) {
				frequencyOfCharacters[s.charAt(i) - 'a']++; // Increment the frequency of the current character
			}
            int count = 0;
 
            for(int i = 0; i<26 ; i++){
                if(frequencyOfCharacters[i] % 2 != 0){
                    count++;
                }
            }
            String arr = (count > a + 1) ? "NO" : "YES";
            System.out.println(arr);
        }
    }
}