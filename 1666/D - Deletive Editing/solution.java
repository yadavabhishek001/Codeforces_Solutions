import java.io.*;
 
public class DDeletiveEditing{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            String parts[] = br.readLine().split(" ");
            String s = parts[0];
            String str = parts[1];
            int n1 = s.length();
            int n2 = str.length();
 
            int freq[] = new int[26];
            for(int i = 0; i<n2 ; i++){
                freq[str.charAt(i) - 'A']++;
            }
 
            StringBuilder finalStr = new StringBuilder();
 
            for(int i = n1-1; i>=0 ; i--){
                if(freq[s.charAt(i) - 'A'] > 0){
                    freq[s.charAt(i) - 'A']--;
                    finalStr.append(s.charAt(i));
                }
            }
 
            finalStr.reverse();
 
            if(finalStr.toString().equals(str)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}