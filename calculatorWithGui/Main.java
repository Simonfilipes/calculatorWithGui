import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int temp = 0;

        while (temp == 0) {

            int choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Welcome to my calculator!\n\n[1] - Sum\n[2] - Subtract\n[3] - Exit\n\n"));

            if (choose == 3) {
                JOptionPane.showMessageDialog(null, "Thanks for enjoying!");
                temp = 1;
                scanner.close();
            }

            if (choose != 1 && choose != 2 && choose != 3) {
                JOptionPane.showMessageDialog(null, "You do something wrong, try another input in the next time.");
            }
            if (choose == 1 || choose == 2) {

                int num1 = 0;
                int num2 = 0;

                if (choose == 1) {

                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Write your first number! [SUM]"));

                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Write your second number! [SUM]"));

                } else {

                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Write your first number! [SUBTRACT]"));

                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Write your second number! [SUBTRACT]"));

                }

                int r = 0;

                switch (choose) {
                    case 1:

                        r = num1 + num2;
                        JOptionPane.showMessageDialog(null, "The result is: " + r);
                        break;

                    case 2:

                        r = num1 - num2;
                        JOptionPane.showMessageDialog(null, "The result is: " + r);
                        break;
                }

            }

        }

    }

}