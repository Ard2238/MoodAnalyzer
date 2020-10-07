package com.cg;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(){
    }
    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(){
        if(message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Mood Analyzer Program");
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyzeMood();
    }
}
