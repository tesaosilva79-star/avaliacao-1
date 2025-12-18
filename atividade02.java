import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = entrada.nextDouble();

        // Cálculos de conversão
        // Fahrenheit: (C * 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Kelvin: C + 273.15
        double kelvin = celsius + 273.15;

        // Exibição dos resultados
        System.out.println("\n--- Resultados da Conversão ---");
        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        entrada.close();
    }
}
