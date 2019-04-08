package edu.progress.correctingtext;

public class SpaceRemoveErrorCorrector implements TextErrorCorrector {

    @Override
    public  String correct(String text){
        StringBuilder builder = new StringBuilder();
        int startPos = 0;
        text =text.trim();
        for (int i = 1; i < text.length() ; i++) {
            if (text.charAt(i-1) == ' ' && text.charAt(i) == ' '){
                builder.append(text.substring(startPos, i));
                for(;text.charAt(i)==' ';i++);
                startPos = i;
            }
        }
        builder.append(text.substring(startPos));
        return builder.toString();
    }

}
