import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the amount in USD: ");
            double USD = sc.nextDouble();
            double Rupee = usdTORupee(USD);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if (choice == 2) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = sc.nextDouble();
            double USD = RupeeToUSD(Rupee);
            System.out.println("Converted amount in USD: " + USD);
        } else if (choice == 3) {
            System.out.print("Enter the amount in EURO: ");
            double EURO = sc.nextDouble();
            double Rupee = euroTORupee(EURO);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if (choice == 4) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = sc.nextDouble();
            double EURO = RupeeToEuro(Rupee);
            System.out.println("Converted amount in Euro: " + EURO);
        } else {
            System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
        }
        
        sc.close();
    }

    public static double usdTORupee(double USD) {
        return USD * 83.47;
    }

    public static double RupeeToUSD(double Rupee) {
        return Rupee * 0.0119804;
    }

    public static double euroTORupee(double EURO) {
        return EURO * 89.10;
    }

    public static double RupeeToEuro(double Rupee) {
        return Rupee * 0.0113;
    }
}
