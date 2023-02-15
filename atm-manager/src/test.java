import java.util.Scanner;

public class test {

    public void doing() {
        Scanner scanner = new Scanner(System.in);
        scanner.next(); //Prendere in input
        System.out.println("Hello world!"); //Stampa a schermo

        int count; //Dichiarazione di una variabile
        count = 3; //Inizializzazione di una variabile
        char letter = 'w';
        int test = 2, y = 5, x = 3;
        boolean isTrue = true;
        long longVariable = 134;

        //Operatori Relazionali -> Risultato è sempre un booleano
        //x > y; //false
        //x < y; //true
        //x >= y;
        //x == y;

        //Operatori di assegnazione - Operatori Aritmetici
        x = 54;
        x += 3; x = x + 3;
        x *= 3; x = x * 3;
        x /= 3; x = x / 3;
        x -= 3; x = x - 3;

        //Operatori di incremento
        x++; x = x + 1;
        x--; x = x - 1;

        if(x < 3) {

        } else if(x == 3) { //x > 3

        } else {

        }

        switch(x) {
            case 1:
                System.out.println("sono il primo case");
                break;
            case 2:

                break;
            case 3:
            case 54:
            default:
                System.out.println("non rispetto nessun valore");
        }

        if(x < 3) {
            System.out.println("condizione true");
        } else {
            System.out.println("condizione false");
        }

        boolean test2 = x < 3
            ? true
            : false;
    }
}
