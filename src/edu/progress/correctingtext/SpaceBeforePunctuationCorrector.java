package edu.progress.correctingtext;

public class SpaceBeforePunctuationCorrector implements TextErrorCorrector {

    private static final String signs = ",.!?;:";

    @Override
    public String correct(String text) {

        StringBuilder builder = new StringBuilder();
        int startPos = 0;
        for (int i = 0; i < text.length() ; i++) {
            if(signs.contains(String.format("%c",text.charAt(i))) && text.charAt(i-1) ==' '){
                builder.append(text.substring(startPos, i-1));
                startPos = i;
            }
        }
        builder.append(text.substring(startPos));
        return builder.toString();
    }

}
