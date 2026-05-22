import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            String timeStr = sc.next();
            
            // Split "hh:mm" into hours and minutes
            int hh = Integer.parseInt(timeStr.substring(0, 2));
            String mm = timeStr.substring(3, 5); 
            
            // Determine AM/PM
            String period = (hh < 12) ? "AM" : "PM";
            
            // Convert hour
            int convertedHh = hh;
            if (hh == 0) {
                convertedHh = 12;
            } else if (hh > 12) {
                convertedHh = hh - 12;
            }
            
            // Print the result
            System.out.printf("%02d:%s %s\n", convertedHh, mm, period);
        }
    }
}
