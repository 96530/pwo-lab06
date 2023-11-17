package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa realizująca generator ciągu Tribonacciego.
 * Rozszerza klasę {@link FibonacciGenerator}, wykorzystując
 * jej podstawową strukturę i mechanizm generowania kolejnych wyrazów ciągu.
 * W odróżnieniu od ciągu Fibonacciego, w ciągu Tribonacciego każdy wyraz jest sumą trzech poprzednich wyrazów.
 * 
 * @author 96530
 * @version 1.0.0
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Konstruktor klasy {@code TribonacciGenerator}.
     * Inicjalizuje trzeci poprzedni wyraz ciągu wartością 0.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resetuje generator do stanu początkowego.
     * Wyzerowuje wartość trzeciego poprzedniego wyrazu ciągu
     * i wywołuje metodę reset z klasy bazowej.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Generuje i zwraca kolejny wyraz ciągu Tribonacciego.
     * Dla indeksów większych niż 2, wyraz jest sumą trzech poprzednich wyrazów.
     * Dla indeksu 2, wartość wyrazu wynosi 1, a dla niższych indeksów - 0.
     *
     * @return Następny wyraz ciągu Tribonacciego jako {@link BigDecimal}.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}