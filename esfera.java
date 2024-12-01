import java.util.Scanner;

public class esfera {
    public float superficie (float r){
        double superficie = (4 * Math.PI * Math.pow(r, 2));
        return (float) superficie; // superficie == 4 * PI * radio al quadrado

    }
    public double volumen (float r){
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(r, 3); // volumen == a 4/3 * PI * radio al cubo
        return volumen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("diga el radio : ");
        float r = sc.nextFloat();
        System.out.print("la superficie es:  ");
        System.out.println(new esfera().superficie(r));
        System.out.print("la volumen es:  ");
        System.out.println(new esfera().volumen(r));


    }
}
