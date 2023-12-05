//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con 12 elementi e stamparlo in console.
//        mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Mario Rossi",25);
        Student studente2 = new Student("Mario Verdi",78);
        Student studente3 = new Student("Mario Bianchi",40);
        Student studente4 = new Student("Rossi Mario",55);
        Student studente5 = new Student("Verdi Mario",32);
        Student studente6 = new Student("Bianchi Mario",15);
        //12 un po' tanti ho fatto 6


        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);
        studenti.add(studente5);
        studenti.add(studente6);

        for (Student student : studenti) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
        studenti.sort(Comparator.comparingInt(Student::getAge));
        //in live coding potremo vedere il '::'
        System.out.println("----------------------");
        for (Student student : studenti) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }

    }
}