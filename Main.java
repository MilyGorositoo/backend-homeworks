import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        double area = circulo.calcularArea(radio);
        double circunferencia = circulo.calcularCircunferencia(radio);

        System.out.println("Area del circulo; " + area);
        System.out.println("Circunferencia del circulo: " + circunferencia);

 }
}