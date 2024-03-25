public class Main {
    public static void main(String[] args) {
        // Print table header
        System.out.println("Celsius\tFahrenheit");

        // Display Celsius to Fahrenheit conversion table
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%d\t%.2f%n", celsius, fahrenheit);
        }
    }

    /**
     * Convert Celsius to Fahrenheit.
     *
     * @param celsius the temperature in Celsius
     * @return the equivalent temperature in Fahrenheit
     */
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
