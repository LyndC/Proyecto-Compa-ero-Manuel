import java.util.Scanner;

public class esferamodificado {
    /**
     * Calcula la superficie de una esfera.
     * @param r el radio de la esfera
     * @return la superficie de la esfera
     */
    public float superficie(float r) {
        double superficie = 4 * Math.PI * Math.pow(r, 2);
        return (float) superficie; // superficie == 4 * PI * radio al cuadrado
    }

    /**
     * Calcula el volumen de una esfera.
     * @param r el radio de la esfera
     * @return el volumen de la esfera
     */
    public double volumen(float r) {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(r, 3); // volumen == 4/3 * PI * radio al cubo
        return volumen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga el radio: ");
        float r = sc.nextFloat();

        esfera esfera = new esfera();

        // Calcular y mostrar la superficie
        float superficie = esfera.superficie(r);
        System.out.printf("La superficie es: %.2f%n", superficie);

        // Calcular y mostrar el volumen
        double volumen = esfera.volumen(r);
        System.out.printf("El volumen es: %.2f%n", volumen);

        sc.close();
    }
}
