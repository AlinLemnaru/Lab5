package Pb3;

import java.util.ArrayList;
import java.util.List;

/**
 * Clasa mobilier, folosita pentru stocarea datelor din fisierul json
 */
public class Mobilier {
    //Declarare variabile
    private String nume;
    public List<Placa> placi = new ArrayList<Placa>();

    //Constructor
    public Mobilier() {
        placi = null;
    }

    public Mobilier(String nume, List<Placa> placi) {
        this.nume = nume;
        this.placi = placi;
    }

    //Getter and Setter
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Placa> getPlaci() {
        return placi;
    }

    public void setPlaci(List<Placa> placi) {
        this.placi = placi;
    }

    //Metode
    @Override
    public String toString() {
        return nume + "\n" + placi.toString();
    }

    /**
     * Determina numarul colilor de pal necesar in realizarea placilor
     *
     * @return <b>int</b> - numarul de coli ArieTotala / ArieColPal
     */
    public int numarColiNecesar() {
        int ariaTotala = 0;
        for (Placa placa : placi)
            ariaTotala += placa.getAriaTotala();
        int arieColPal = 2800 * 2070;
        return (int) Math.ceil((double) ariaTotala / arieColPal);
    }
}
