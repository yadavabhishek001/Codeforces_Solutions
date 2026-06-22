import java.io.*;
 
public class AThreeIndices{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
 
            int arr[] = new int[n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = Integer.parseInt(input[i]);
            }
 
            boolean flag = false;
 
            for(int i = 1; i<n-1 ; i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    flag = true;
                    bw.write("YES");
                    bw.newLine();
                    bw.write((i)+" "+ (i+1) +" "+(i+2));
                    flag = true;
                    break;
                }
            }
 
            // for(int j = 1; j<n-1 ; j++){
            //     int i = -1;
            //     int k = -1;
            //     for(int left = 0; left<j ; left++){
            //         if(arr[left] < arr[j]){
            //             i = left;
            //             break;
            //         }
            //     }
            //     for(int right = j+1 ; right<n ; right++){
            //         if(arr[j] > arr[right]){
            //             k = right;
            //             break;
            //         }
            //     }
            //     if(i != -1 && k != -1){
            //         bw.write("YES");
            //         bw.newLine();
            //         bw.write((i+1)+" "+ (j+1) +" "+(k+1));
            //         flag = true;
            //         break;
            //     }
            // }
            if(!flag){
                bw.write("NO");
            }
            bw.newLine();
            bw.flush();
        }
    }
}