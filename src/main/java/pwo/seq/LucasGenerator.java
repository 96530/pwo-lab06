package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa implementująca generator ciągu Lucasa.
 * Dziedziczy po klasie {@link FibonacciGenerator}, zmieniając warunki początkowe
 * tak, aby odpowiadały definicji ciągu Lucasa.
 * W ciągu Lucasa pierwsze dwa wyrazy to 2 i 1, a każdy następny jest sumą dwóch poprzednich.
 * Klasa nadpisuje niektóre metody z klasy bazowej w celu dostosowania ich do specyfiki ciągu Lucasa.
 *
 * @author 96530
 * @see FibonacciGenerator
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy LucasGenerator.
     * Inicjalizuje ciąg wartościami specyficznymi dla ciągu Lucasa.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Resetuje generator do stanu początkowego ciągu Lucasa.
     * Nadpisuje metodę reset z klasy bazowej, ustawiając początkowe wartości
     * na odpowiednie dla ciągu Lucasa.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Zwraca kolejny wyraz ciągu Lucasa.
     * Nadpisuje metodę nextTerm z klasy bazowej, zapewniając poprawne generowanie
     * wyrazów ciągu Lucasa.
     * 
     * @return Następny wyraz ciągu Lucasa jako {@link BigDecimal}.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}