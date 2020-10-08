package com.cg;

public class MoodAnalyzer {
    private String message;
    public enum Mood {NULL, EMPTY};

    public MoodAnalyzer(){
    }
    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(){
        try{
            if(message.contains("Sad"))
                return "SAD";
            else if(message == null || message.isEmpty()) {
                throw new NullPointerException();
            }
        }catch(NullPointerException e) {
            throw new MoodAnalysisException("Invalid Mood.");
        }finally {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyzeMood();
    }
}