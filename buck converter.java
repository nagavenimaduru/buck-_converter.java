import java.util.Scanner;

public class BuckConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Buck Converter Calculator =====");

        System.out.print("Enter input voltage (Vin) in volts: ");
        double vin = sc.nextDouble();

        System.out.print("Enter duty cycle (%) : ");
        double dutyCycle = sc.nextDouble();

        // Buck converter formula:
        // Vout = D × Vin
        double dutyRatio = dutyCycle / 100.0;
        double vout = dutyRatio * vin;

        System.out.println("\n----- Results -----");
        System.out.printf("Input Voltage  : %.2f V%n", vin);
        System.out.printf("Duty Cycle     : %.2f %% %n", dutyCycle);
        System.out.printf("Output Voltage : %.2f V%n", vout);

        sc.close();
    }
}
