import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("John Doe");

        System.out.println("Bienvenido, " + user.getName());
        System.out.println("Saldo inicial: $" + user.getAccount().getBalance());

        while (true) {
            System.out.println("Elija una opción: ");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Convertir a Euros");
            System.out.println("4. Salir");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double depositAmount = scanner.nextDouble();
                    user.getAccount().deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double withdrawAmount = scanner.nextDouble();
                    user.getAccount().withdraw(withdrawAmount);
                    break;
                case 3:
                    double convertedAmount = CurrencyConverter.convertToEuros(user.getAccount().getBalance());
                    System.out.println("Saldo en euros: €" + convertedAmount);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema. ¡Adiós!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println("Saldo actual: $" + user.getAccount().getBalance());
        }
    }
}
