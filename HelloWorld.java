import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somma =0;
        int numero ;
        System.out .println("inserisci 5 numero ");
        for (int i = 0; i < 5; i++) {
            numero = input.nextInt();
            somma += numero;
        }
        System.out.println("la somma dei numeri è : " + somma);
        input.close();
   } 
}