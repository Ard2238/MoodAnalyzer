package com.cg;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(){
    }
    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(){
        if(message == null){
            try{
                throw new RuntimeException();
            }catch (RuntimeException e){
                return "HAPPY";
            }
        }
        if(message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyzeMood();
    }
}