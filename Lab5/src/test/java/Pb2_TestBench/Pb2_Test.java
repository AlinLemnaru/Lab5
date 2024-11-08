package Pb2_TestBench;

import Pb2.PerecheNumere;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Documented;

import static org.junit.jupiter.api.Assertions.*;

public class Pb2_Test {
    //isFibonacci()
    /**
     * Tc_01 - Positive Use Case Test - isFibonacci<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(3, 5)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - true<br>
     */
    @Test
    public void T_01_isFibonacci() {
        PerecheNumere p = new PerecheNumere(3, 5);
        assertTrue(p.isFibonacci());
    }

    /**
     * Tc_02 - Positive Use Case Test - isFibonacci<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(5, 6)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_02_isFibonacci() {
        PerecheNumere p = new PerecheNumere(5, 6);
        assertFalse(p.isFibonacci());
    }

    /**
     * Tc_03 - Positive Use Case Test - isFibonacci<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(-10, 6)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_03_isFibonacci() {
        PerecheNumere p = new PerecheNumere(-10, 6);
        assertFalse(p.isFibonacci());
    }

    /**
     * Tc_04 - Positive Use Case Test - isFibonacci<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(3, 3)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_04_isFibonacci() {
        PerecheNumere p = new PerecheNumere(3, 3);
        assertFalse(p.isFibonacci());
    }

    /**
     * Tc_05 - Positive Use Case Test - isFibonacci<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(0, 1)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - true<br>
     */
    @Test
    public void T_05_isFibonacci() {
        PerecheNumere p = new PerecheNumere(0, 1);
        assertTrue(p.isFibonacci());
    }

    //getCMMMC()
    /**
     * Tc_06 - Positive Use Case Test - getCMMMC<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(3, 7)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - 21<br>
     */
    @Test
    public void T_06_getCMMMC() {
        PerecheNumere p = new PerecheNumere(3, 7);
        assertEquals(21, p.getCMMMC());
    }

    /**
     * Tc_07 - Positive Use Case Test - getCMMMC<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(7, 3)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - 21<br>
     */
    @Test
    public void T_07_getCMMMC() {
        PerecheNumere p = new PerecheNumere(7, 3);
        assertEquals(21, p.getCMMMC());
    }

    /**
     * Tc_08 - Positive Use Case Test - getCMMMC<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(0, 34)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - 0<br>
     */
    @Test
    public void T_08_getCMMMC() {
        PerecheNumere p = new PerecheNumere(0, 34);
        assertEquals(0, p.getCMMMC());
    }

    /**
     * Tc_09 - Positive Use Case Test - getCMMMC<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(-7, 3)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - 21<br>
     */
    @Test
    public void T_09_getCMMMC() {
        PerecheNumere p = new PerecheNumere(-7, 3);
        assertEquals(21, p.getCMMMC());
    }

    /**
     * Tc_10 - Positive Use Case Test - getCMMMC<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(-10, -5)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - !(-10)<br>
     */
    @Test
    public void T_10_getCMMMC() {
        PerecheNumere p = new PerecheNumere(-10, -5);
        assertNotEquals(-10, p.getCMMMC());
    }

    //digitSumIsEqual()
    /**
     * Tc_11 - Positive Use Case Test - digitSumIsEqual<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(20, 11)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - true<br>
     */
    @Test
    public void T_11_digitSumIsEqual() {
        PerecheNumere p = new PerecheNumere(20, 11);
        assertTrue(p.digitSumIsEqual());
    }

    /**
     * Tc_12 - Positive Use Case Test - digitSumIsEqual<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(999, 8883)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - true<br>
     */
    @Test
    public void T_12_digitSumIsEqual() {
        PerecheNumere p = new PerecheNumere(999, 8883);
        assertTrue(p.digitSumIsEqual());
    }

    /**
     * Tc_13 - Positive Use Case Test - digitSumIsEqual<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(0, 0)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - true<br>
     */
    @Test
    public void T_13_digitSumIsEqual() {
        PerecheNumere p = new PerecheNumere(0, 0);
        assertTrue(p.digitSumIsEqual());
    }

    /**
     * Tc_14 - Positive Use Case Test - digitSumIsEqual<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(30, 11)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_14_digitSumIsEqual() {
        PerecheNumere p = new PerecheNumere(30, 11);
        assertFalse(p.digitSumIsEqual());
    }

    /**
     * Tc_15 - Positive Use Case Test - digitSumIsEqual<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(-20, 11)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_15_digitSumIsEqual() {
        PerecheNumere p = new PerecheNumere(-20, 11);
        assertFalse(p.digitSumIsEqual());
    }

    //sameEvenDigitCount()
    /**
     * Tc_16 - Positive Use Case Test - sameEvenDigitCount<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(2, 4)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - true<br>
     */
    @Test
    public void T_16_sameEvenDigitCount() {
        PerecheNumere p = new PerecheNumere(2, 4);
        assertTrue(p.sameEvenDigitCount());
    }

    /**
     * Tc_17 - Positive Use Case Test - sameEvenDigitCount<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(3, 5)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - true<br>
     */
    @Test
    public void T_17_sameEvenDigitCount() {
        PerecheNumere p = new PerecheNumere(3, 5);
        assertTrue(p.sameEvenDigitCount());
    }

    /**
     * Tc_18 - Positive Use Case Test - sameEvenDigitCount<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(20, 43)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_18_sameEvenDigitCount() {
        PerecheNumere p = new PerecheNumere(20, 43);
        assertFalse(p.sameEvenDigitCount());
    }

    /**
     * Tc_19 - Positive Use Case Test - sameEvenDigitCount<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(-2, 4)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_19_sameEvenDigitCount() {
        PerecheNumere p = new PerecheNumere(-2, 4);
        assertFalse(p.sameEvenDigitCount());
    }

    /**
     * Tc_20 - Positive Use Case Test - sameEvenDigitCount<br>
     * <b>Preconditie</b> - Crearea unui obiect de tip PerecheNumere(0, 1000)<br>
     * <b>Procedura</b> - Apelarea metodei<br>
     * <b>Expected</b> - false<br>
     */
    @Test
    public void T_20_sameEvenDigitCount() {
        PerecheNumere p = new PerecheNumere(0, 1000);
        assertFalse(p.sameEvenDigitCount());
    }
}
