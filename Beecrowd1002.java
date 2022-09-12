import java.util.Scanner;


public class Beecrowd1002 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double raio, A;

        System.out.println("Digite o valor do raio");
        raio = ler.nextFloat();
        A = 3.14159*Math.pow(raio,2);
        System.out.println("A=" + A);
    }
}