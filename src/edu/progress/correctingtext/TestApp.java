package edu.progress.correctingtext;

public class TestApp {

    public static void main(String[] args) {
	TextErrorCorrector corrector = new SpaceRemoveErrorCorrector();
	TextErrorCorrector cor2 = new SpaceBeforePunctuationCorrector();

        System.out.println( cor2.correct(corrector.correct("Nasila zakaraha svinete ni v Sahara     kaza Lisan !")));
        
    }
}
