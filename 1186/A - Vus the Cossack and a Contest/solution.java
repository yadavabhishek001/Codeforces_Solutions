import java.util.Scanner;
 
public class AVusTheCossackAndAContest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int pen = sc.nextInt();
        int notebook = sc.nextInt();
 
        if(pen >= n && notebook >= n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}