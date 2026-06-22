import java.util.Scanner;
 
public class AFoodForAnimals{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
 
            int dog = a - x;
            int cat = b - y;
 
            int dogNeed = -1 * dog;
            int catNeed = -1 * cat;
 
            if(dogNeed > 0) c = c - dogNeed;
            if(catNeed > 0) c = c - catNeed;
 
            if(c < 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}