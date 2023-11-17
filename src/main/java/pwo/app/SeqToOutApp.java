package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Aplikacja konsolowa do wypisywania ciągów liczbowych.
 * Rozszerza klasę SeqToFileApp, dostosowując jej działanie do wypisywania ciągów na konsolę.
 *
 * @author 96530
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Przetwarza argumenty wejściowe przekazane do aplikacji.
     * Argumenty powinny zawierać informacje o rodzaju ciągu i zakresie indeksów do generowania.
     *
     * @param args Tablica argumentów przekazanych do aplikacji.
     * @return true, jeśli argumenty są poprawne, w przeciwnym razie false.
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }

        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Przetwarza argumenty wejściowe przekazane do aplikacji.
     * Argumenty powinny zawierać informacje o rodzaju ciągu i zakresie indeksów do generowania.
     *
     * @param args Tablica argumentów przekazanych do aplikacji.
     * @return true, jeśli argumenty są poprawne, w przeciwnym razie false.
     */
    @Override
    protected boolean wirteSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(
        seqType.getGenerator(), from, to));

        return true;
    }

    /**
     * Główna metoda uruchamiająca aplikację.
     * Wypisuje informacje o aplikacji, przetwarza argumenty i wypisuje ciąg na konsolę.
     *
     * @param args Tablica argumentów przekazanych do aplikacji.
     */
    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }
        wirteSeq();
    }

}
