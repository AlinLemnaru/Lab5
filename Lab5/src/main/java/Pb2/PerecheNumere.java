package Pb2;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Clasa PerecheNumere, ce are ca membrii: (int)x, (int)y
 *
 * @author Lemnaru Alin-Gabriel
 * @version 1
 * @since 2024-11-08
 */
public class PerecheNumere {
    //Declarare variabile
    private int x, y;

    //Constructor
    public PerecheNumere() {
    }

    /**
     * Constructorul cu parametrii a clasei
     *
     * @param x
     * @param y
     */
    public PerecheNumere(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getter and Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Metode
    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    /**
     * @return <b>true</b> - daca x si y sunt termeni consecutivi in sirul lui Fibonacci<br>
     * <b>false</b> - daca x si y nu sunt termeni consecutivi in sirul lui Fibonacci
     */
    @JsonIgnore
    public boolean isFibonacci() {
        int t1 = 0, t2 = 1, t3 = 0;

        if (x < 0 || y < 0)
            return false;

        if (t1 == x && t2 == y)
            return true;

        while (t3 <= x) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;

            if (t1 == x && t2 == y)
                return true;
        }

        return false;
    }

    /**
     * @return <b>cmmmc</b> - (int) Cel mai mic multiplu comun al numerelor x si y
     */
    @JsonIgnore
    public int getCMMMC() {
        int a = x, b = y, prod;

        if (x < 0)
            a *= -1;

        if (y < 0)
            b *= -1;

        prod = a * b;

        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return prod / a;
    }

    /**
     * @return <b>true</b> - daca suma cifrelor numerelor x si y sunt egale<br>
     * <b>false</b> - daca suma cifrelor nu e egala
     */
    @JsonIgnore
    public boolean digitSumIsEqual() {
        int sum_x = 0, sum_y = 0, x_copy = x, y_copy = y;

        while (x_copy > 0) {
            sum_x += x_copy % 10;
            x_copy /= 10;
        }

        while (y_copy > 0) {
            sum_y += y_copy % 10;
            y_copy /= 10;
        }

        return sum_x == sum_y;
    }

    /**
     * @return <b>true</b> - daca numarul cifrelor pare din x si y sunt egale<br>
     * <b>false</b> - daca numarul cifrelor pare nu sunt egale
     */
    @JsonIgnore
    public boolean sameEvenDigitCount() {
        int x_cnt = 0, y_cnt = 0, x_copy = x, y_copy = y;

        while (x_copy > 0) {
            if ((x_copy % 10) % 2 == 0)
                x_cnt++;
            x_copy /= 10;
        }

        while (y_copy > 0) {
            if ((y_copy % 10) % 2 == 0)
                y_cnt++;
            y_copy /= 10;
        }

        return x_cnt == y_cnt;
    }
}
