package filtering;


import rx.Observable;
import util.DataGenerator;

public class PositionalExampleDistinct {
    
    public static void main(String[] args) {

        Observable.from(DataGenerator.generateScrambledAndDuppedGreekAlphabet())
                .subscribe((letter) -> {
                    System.out.println(letter);
                });
        
        System.out.println("------------------------------------------------------------");
        
        // Emit each string value only once, even if it appears in the 
        // original list multiple times.
        Observable.from(DataGenerator.generateScrambledAndDuppedGreekAlphabet())
                .distinct()
                .subscribe((letter) -> {
                    System.out.println(letter);
                });
        
        System.out.println("------------------------------------------------------------");
        
        System.exit(0);
    }
}
