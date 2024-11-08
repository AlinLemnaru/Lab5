package Pb3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Clasa principala
 *
 * @author Lemnaru Alin-Gabriel
 * @version 1
 * @since 2024-11-08
 */
public class Pb3_Main {
    /**
     * Efectuaza afisarea optiunilor
     */
    public static void displayMeniu() {
        System.out.println(
                """
                        a) Citește datele despre piesele de mobilier din fișierul mobilier.json într-o listă de piese
                        de mobilier (List<Mobilier>) și le afișează
                        b) Afişează elementele de mobilier din colecție şi plăcile care le compun
                        c) Afişează caracteristicile plăcilor care compun o anumită piesă de mobilier
                        d) Afișează estimativ numărul colilor de pal necesare pentru realizarea unui anumit corp
                        e) Iesire
                        """
        );
    }

    /**
     * Efectueaza citirea din fisierul mobilier.json, returnand datele din acesta sub forma de lista
     *
     * @return <b>list</b> - lista mobilier
     */
    public static List<Mobilier> citire() {
        try {
            File file = new File("src/main/resources/mobilier.json");
            ObjectMapper mapper = new ObjectMapper();
            return mapper
                    .readValue(file, new TypeReference<>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Mobilier> mobila = citire();
        char optiune;
        String nume_mobila;

        //Meniu principal
        while (true) {
            displayMeniu();
            System.out.print("Optiunea dvs: ");
            optiune = sc.nextLine().charAt(0);

            switch (optiune) {
                case 'a':
                    System.out.println("\n\nAfiasare lista mobilier:\n");
                    assert mobila != null;
                    for (Mobilier mobilier : mobila)
                        System.out.println(mobilier.getNume());
                    System.out.println("\n--------------------\n");
                    break;
                case 'b':
                    System.out.println("\n\nAfiasare lista mobilier + placi:\n");
                    assert mobila != null;
                    for (Mobilier mobilier : mobila) {
                        System.out.println("\n" + mobilier.getNume() + ": ");
                        for (Placa placa : mobilier.getPlaci())
                            System.out.println(placa.getDescriere());
                        System.out.println("\n--------------------\n");
                    }
                    break;
                case 'c':
                    System.out.println("\n\nAfiasare caracteristici placi:\n");
                    System.out.print("Mobila dorita: ");
                    nume_mobila = sc.nextLine();
                    assert mobila != null;
                    for (Mobilier mobilier : mobila)
                        if (mobilier.getNume().equals(nume_mobila))
                            System.out.println(mobilier.toString());
                    System.out.println("\n--------------------\n");
                    break;
                case 'd':
                    System.out.println("\n\nAfiasare caracteristici placi:\n");
                    System.out.print("Mobila dorita: ");
                    nume_mobila = sc.nextLine();
                    assert mobila != null;
                    for (Mobilier mobilier : mobila)
                        if (mobilier.getNume().equals(nume_mobila))
                            System.out.println("Numar necesar coli: " + mobilier.numarColiNecesar());
                    System.out.println("\n--------------------\n");
                    break;
                case 'e':
                    System.out.println("\n\nIESIRE...\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\nOptiune Invalida!!!\n");
                    break;
            }
        }
    }
}
