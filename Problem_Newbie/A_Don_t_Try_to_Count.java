import java.util.Scanner;
public class A_Don_t_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            String str1 = sc.next();
            String str2 = sc.next();

            StringBuilder sb = new StringBuilder(str1);
            int count = 0;

            do{
                if(sb.indexOf(str2) == -1){
                    sb.append(sb);
                    count++;
                }
                else{
                    break;
                }
            }while(sb.length() <= 25);
            
            if(sb.length()<=25){
                System.out.println(count);
            }
            else if(sb.indexOf(str2) != -1){
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }
            
        }
        sc.close();
    }
}
