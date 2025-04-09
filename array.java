import  java.util.Scanner;
public class array {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);

        System.out.print("Quanti elementi vuoi inserire? ");
        int n = input.nextInt();
       
         int[] numeri = new int[n]; // array di dimensione n

        for(int i = 0; i < n; i++){
            System.out.print("Inserisci elemento [" + i + "]: ");
            numeri[i] = input.nextInt();
        }
             System.out.println(  n);
     /*    System.out.println("Hai inserito questi numeri:");
        for(int num : numeri){
            System.out.println(num);
        }

        input.close();

      /* 
        int[] numeri = {1, 2, 3, 4, 5};
        int somma = 0;
        for(int num : numeri){
            somma += num;
        }
        System.out.println("La somma dei numeri nell'array e': " + somma);
        int media = somma / numeri.length;
        System.out.println("La media dei numeri nell'array e': " + media);*/

        /*Esercizio 1.1
Dichiarare variabili di ogni tipo primitivo (int, double, float, char, boolean, byte, short, long) e assegnare loro un valore. Stampa ogni variabile su console. */
/* 
int a = 10;
double b = 20.5;
float c = 30.533f;    
char d = 'A';           
boolean e = true;        
byte f = 10;            
short g = 20;           
long pippo = 30L;           

System.out.println("Valore di a: " + a);
System.out.println("Valore di b: " + b);
System.out.println("Valore di c: " + c);
System.out.println("Valore di d: " + d);
System.out.println("Valore di e: " + e);
System.out.println("Valore di f: " + f);
System.out.println("Valore di g: " + g);
System.out.println("Valore di h: " + pippo);*/

/*
Esercizio 1.2
Crea una variabile di tipo String, assegnale il tuo nome, e stampa un messaggio di benvenuto che includa il tuo nome.

Esercizio 1.3
Chiedi all'utente di inserire due numeri interi (usando Scanner), salva i numeri in variabili di tipo int, e stampa la loro somma
NOVITÀ
[20:25]
Esercizio 2.1
Crea un array di tipo int con 5 elementi. Assegna valori direttamente nell’inizializzazione e stampa tutti i valori usando un ciclo for.

Esercizio 2.2
Crea un array di tipo double con 4 elementi. Inizializzalo direttamente e calcola la somma di tutti i valori, poi stampa il risultato.

Esercizio 2.3
Crea un array di tipo String con 3 elementi (es. nomi di città). Stampa il nome di ogni città in ordine inverso (ultimo elemento per primo).


 String[] nomi = new String[3];
 nomi[0] = "Roma";
 nomi[1] = "Milano";
 nomi[2] = "Napoli";
 for (int i = nomi.length - 1; i >= 0; i--) {
    System.out.println(nomi[i]);
 }




NOVITÀ
[20:25]
Esercizio 3.1
Chiedi all'utente quanti numeri interi vuole inserire (usando Scanner).
Crea un array di quella dimensione e lascia che l'utente inserisca ogni numero. Alla fine, stampa tutti i numeri.
*/

Scanner input = new Scanner(System.in);

System.out.print("Quanti numeri vuoi inserire? ");
int n = input.nextInt();

int[] numeri = new int[n]; // array di dimensione n

for(int i = 0; i < n; i++){
    System.out.print("Inserisci numero [" + i + "]: ");
    numeri[i] = input.nextInt();
}

System.out.println("Hai inserito questi numeri:");
for(int num : numeri){
    System.out.println(num);
}





/*
Esercizio 3.2
Chiedi all'utente quanti nomi desidera memorizzare.
Crea un array di tipo String di dimensione variabile, chiedi all’utente di inserire i nomi e poi stampa l’elenco completo.

Esercizio 3.3
Chiedi all’utente quanti numeri decimali vuole inserire.
Crea un array di tipo float o double, inserisci i valori forniti dall’utente e calcola la media.
NOVITÀ
[20:26]
Esercizio 4.1
Chiedi all’utente di fornire la dimensione dell’array e i suoi valori. Trova e stampa il valore massimo e il valore minimo presenti nell’array.

Esercizio 4.2
Chiedi all’utente di inserire una serie di valori interi e memorizzali in un array. Ordina i valori in ordine crescente e stampali.

Esercizio 4.3
Crea un programma che chiede all’utente di inserire 5 numeri in un array.
Poi chiedi all’utente un numero da cercare nell’array e verifica se è presente o meno. */
    }
}
