import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student studente1 = new Student("Wesker", 28);
        Student studente2 = new Student ("Costanza", 30);

        ArrayList<Student> studenti = new ArrayList<Student>();
            studenti.add(studente1);
            studenti.add(studente2);

                System.out.println(studenti);


        Student studente3 = new Student("Marco", 44);
        Student studente4 = new Student ("Francesco", 33);
        Student studente5 = new Student("Luca", 28);
        Student studente6 = new Student ("Chiara", 35);


            studenti.add(studente3);
            studenti.add(studente4);
            studenti.add(studente5);
            studenti.add(studente6);

        System.out.println(studenti);

        }
    }





//Creare una classe Student che accetti nel costruttore il parametro Name (String) e Age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console