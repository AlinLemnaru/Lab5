package Pb3;

import java.util.Arrays;

/**
 * Clasa Placa, folosita pentru listarea placilor unui corp de mobilier, dar si a caracteristicilor acestora
 */
public class Placa {
    //Declarare variabile
    private String descriere; //usa, capac, laterală, raft mobil, raft fix, etc
    private int lungime; //mm
    private int latime; //mm
    private Orientare orientare;
    private boolean[] canturi = new boolean[4];
    private int nr_bucati;

    //Constructor
    public Placa() {
    }

    public Placa(String descriere, int lungime, int latime, Orientare orientare, boolean[] canturi, int nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }

    //Getter and Setter
    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public Orientare getOrientare() {
        return orientare;
    }

    public void setOrientare(Orientare orientare) {
        this.orientare = orientare;
    }

    public boolean[] getCanturi() {
        return canturi;
    }

    public void setCanturi(boolean[] canturi) {
        this.canturi = canturi;
    }

    public int getNr_bucati() {
        return nr_bucati;
    }

    public void setNr_bucati(int nr_bucati) {
        this.nr_bucati = nr_bucati;
    }

    //Metode
    @Override
    public String toString() {
        return descriere + ", " + lungime + ", " + latime + ", " + orientare + ", " + Arrays.toString(canturi) + ", " + nr_bucati + "\n";
    }

    /**
     * @return <b>int</b> - Aria totala a placii * numarul de bucati
     */
    public int getAriaTotala() {
        return lungime * latime * nr_bucati;
    }
}
