import java.util.Scanner;

class 1791ACodeforces_Checking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "codeforces";
        String ans = "";
        for(int i = 0; i<t ;i++){
            char a = sc.next().charAt(0);
            for(int j = 0; j<10 ; j++ ){
                ans = "NO";
                if(s.charAt(j) == a){
                    ans = "YES";
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
