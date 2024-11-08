package Pb2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clasa principala
 *
 * @author Lemnaru Alin-Gabriel
 * @version 1
 * @since 2024-11-08
 */
public class Pb2_Main {

    /**
     * Functia ce realizeaza scrierea in fisierul numere.json
     *
     * @param list
     * @throws IOException
     */
    public static void numere_writeJson(List<PerecheNumere> list) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/numere.json");
        mapper.writeValue(file, list);
    }

    /**
     * Functia ce realizeaza citirea din fisierul numere.json
     *
     * @return list
     * @throws IOException
     */
    public static List<PerecheNumere> numere_readJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/numere.json");
        return mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {
        });
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<PerecheNumere> lista_perehe = new ArrayList<>();
        lista_perehe = numere_readJson();

        //Afisarea Listei de perechi de numere
        System.out.println("Afisarea listei:");
        for (PerecheNumere p : lista_perehe)
            System.out.println(p.toString());

        //Adaugarea unei perechi si scrierea ei in fisierul json
        /*int a, b;

        System.out.print("\na = ");
        a = sc.nextInt();

        System.out.print("b = ");
        b = sc.nextInt();

        lista_perehe.add(new PerecheNumere(a, b));
        numere_writeJson(lista_perehe);*/

        //Afisarea Listei de perechi de numere si a metodelor
        System.out.println("\n\nAfisarea listei:");
        for (PerecheNumere p : lista_perehe) {
            System.out.println("\n\n" + p.toString() + ":");

            System.out.print("Termeni consecutivi Fibonacci: ");
            System.out.println(p.isFibonacci());

            System.out.print("CMMMC: ");
            System.out.println(p.getCMMMC());

            System.out.print("Suma cifrelor egala: ");
            System.out.println(p.digitSumIsEqual());

            System.out.print("Acelasi numar de cifre pare: ");
            System.out.println(p.sameEvenDigitCount());
        }
    }
}
