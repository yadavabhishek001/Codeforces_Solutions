import java.util.Scanner;

public class 49A_Sleuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        char lastLetter = ' ';

        for (int i = sentence.length() - 1; i >= 0; i--) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                lastLetter = Character.toLowerCase(ch);
                break;
            }
        }

        if (lastLetter == 'a' || lastLetter == 'e' || lastLetter == 'i' ||
            lastLetter == 'o' || lastLetter == 'u' || lastLetter == 'y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
