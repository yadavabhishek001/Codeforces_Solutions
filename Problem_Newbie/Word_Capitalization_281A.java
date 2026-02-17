import java.util.Scanner;
 
public class Word_Capitalization_281A { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        System.out.println(str);
        sc.close();
    }
}
