import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //1: Pedir medida do lado do quadrado

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a medida do lado do quadrado: ");
        int lado = sc.nextInt();
        sc.close();

        //2: Calcular a área do quadrado

        int area = lado * lado;
        
        //3: Calcular e mostrar o dobro da área do quadrado

        int dobro = area * 2;

        System.out.println("O dobro da área do quadrado de lado " + lado + " é igual a " + dobro);

    }
}
