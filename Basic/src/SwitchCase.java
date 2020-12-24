import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rank = scanner.nextInt();
        char medalColor;

        switch (rank) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                medalColor = 'A';
        }

        System.out.println("Rank: " + rank + ", Medal: " + medalColor);

        int month = scanner.nextInt();
        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case  4: case 6:; case 11:
                days = 30;
            default:
                System.out.println("Err");
                days = 0;
        }

        System.out.format("%d days.", days);
    }

}
