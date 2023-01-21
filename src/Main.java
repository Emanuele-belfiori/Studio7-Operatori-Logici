public class Main {
    public static void main(String[] args) {
        System.out.println("Operatori Logici");

        /*
         * Operatori Logici
         *
         * operatori: AND (&&) --> equivale ad e cioè anche (tutte le condizioni devono conicidere vere)
         *            OR (||) --> equivale ad oppure (le condizioni vanno valutate distintamente)
         *            NOT (!) --> equivale a diverso (le condizioni devono essere diverse)
         */

        //           true         false          true        true
        boolean p = (3 < 10 && 3 % 2 == 0) || (6 < 10 && 6 % 2 == 0); // False || True == True
        // 3 è minore di 10 e -->(&&) il modulo % di 3 % 2 da resto 0 ?
        /*La prima condizione inserita 3 < 10 darà il risultato True ma dato che abbiamo inserito
          un'altra condizione dopo (&&) che dovrà essere valutata insieme alla prima il risultato
          a stampa sarà False perchè il resto di 3 % 2 sarà uno (dispari) e non 0 */

        /* L'uso degli operatori logici può far sì che in un inserimento di dati si possano valutare
           più condizioni e in base agli operatori che utilizzeremo potranno o dovranno essere:
           tutte uguali (&&), o tutte diverse (!) oppure potranno essere valutate distintatemnte (||) */
        System.out.println(p);

        // Esempi di operatore (!) diverso:

        // boolean p = 3 !=10; // Sarà true perché chiediamo se 3 è diverso da 10
        // boolean p = 3 !=3;  // Sarà False perché chiediamo se 3 è diverso da 3
        // System.out.println(p);
    }
}