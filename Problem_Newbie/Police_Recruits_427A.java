import java.util.Scanner;

class Police_Recruits_427A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        int sum = 0;
        for(int i = 0; i<t ; i++){
            int a = sc.nextInt();
            if(sum <= 0 && a == -1){
                count++;
            }
            else if(sum > 0 && a == -1){
                sum += a;
            }
            else if(sum >= 0 && a > 0){
                sum += a;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
