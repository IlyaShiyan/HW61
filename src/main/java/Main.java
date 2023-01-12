import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculate calculate = (x, y, operation) -> {
            int result = 0;
            switch (operation) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '/':
                    result = x / y;
                    break;
                case '*':
                    result = x * y;
                    break;
            }

            System.out.println(result);
        };

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        char operation = scanner.next().charAt(0);

        calculate.calculate(x, y, operation);

    }
}
