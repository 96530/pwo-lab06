package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa FibonacciGenerator jest odpowiedzialna za generowanie kolejnych wyrazów ciągu Fibonacciego.
 * Dziedziczy ona po klasie Generator.
 *
 * @author 96530
 */
public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor klasy FibonacciGenerator. Inicjuje zmienne odpowiednie dla ciągu Fibonacciego.
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Metoda reset() służy do zresetowania generatora do stanu początkowego.
     * Nadpisuje ona również metodę reset() z klasy nadrzędnej.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Metoda nextTerm() generuje kolejny wyraz ciągu Fibonacciego.
     * @return Kolejny wyraz ciągu Fibonacciego w postaci obiektu BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}