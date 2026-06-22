import java.util.*;
 
public class AForked {
    static class Pair{
        int a;
        int b;
        Pair(int x, int y){
            this.a = x;
            this.b = y;
        }
 
        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
			Pair pair = (Pair) o;
			return a == pair.a && b == pair.b;
        }
 
        @Override
		public int hashCode() {
			return Objects.hash(a, b);
		}
    }
    static int[] dx = {-1,1,-1,1};
    static int[] dy = {-1,-1,1,1};
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xKing = sc.nextInt();
            int yKing = sc.nextInt();
            int xQueen = sc.nextInt();
            int yQueen = sc.nextInt();
 
            Set<Pair> KingPos = new HashSet<>();
            Set<Pair> QueenPos = new HashSet<>();
 
            for(int j = 0; j<4 ; j++){
                //King
                KingPos.add(new Pair(xKing + dx[j] * a , yKing + dy[j] * b));
                KingPos.add(new Pair(xKing + dx[j] * b , yKing + dy[j] * a));
 
                //Queen
                QueenPos.add(new Pair(xQueen + dx[j] * a , yQueen + dy[j] * b));
                QueenPos.add(new Pair(xQueen + dx[j] * b , yQueen + dy[j] * a));
            }
            int count = 0;
 
            for(Pair pos : KingPos){
                if(QueenPos.contains(pos)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}