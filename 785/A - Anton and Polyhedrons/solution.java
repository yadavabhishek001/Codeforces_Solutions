import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int sum = 0;
        
        while(t-- > 0){
            String s = sc.next();
            
            if(s.equals("Icosahedron")){
                sum += 20;
            }
            else if(s.equals("Cube")){
                sum += 6;
            }
            else if(s.equals("Tetrahedron")){
                sum += 4;
            }
            else if(s.equals("Dodecahedron")){
                sum += 12;
            }
            else if(s.equals("Octahedron")){
                sum += 8;
            }
        }
        System.out.print(sum);
        sc.close();
    }
}