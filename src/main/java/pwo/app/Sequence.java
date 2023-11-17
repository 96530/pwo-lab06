package pwo.app;

/**
 * Klasa reprezentująca punkt wejścia aplikacji Sequence.
 * Aplikacja ta akceptuje 3 lub 4 argumenty i uruchamia SeqToOutApp w zależności od ilości argumentów.
 * 
 * @author 96530
 */
public class Sequence {
    
    /**
     * Główny punkt wejścia aplikacji Sequence.
     * 
     * @param args Tablica argumentów z linii poleceń. Oczekiwane 3 lub 4 argumenty.
     */
    public static void main(String[] args) {
        
        switch(args.length){
            case 3: (new SeqToOutApp()).run(args); break;
            case 4: (new SeqToOutApp()).run(args); break;
            default: System.out.println("!Illegal arguments\n"
            + "Legal usage: seqName from to [fileName");
        }
    }
}