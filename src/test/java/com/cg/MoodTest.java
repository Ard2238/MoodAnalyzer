package com.cg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodTest {
    MoodAnalyzer moodAnalyzer;

    @Test
    public void givenMessage_whenSad_returnSAD(){
        moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        Assert.assertEquals("SAD", moodAnalyzer.analyzeMood());
    }

    @Test
    public void givenMessage_whenAnyMood_returnHAPPY(){
        moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        Assert.assertEquals("HAPPY", moodAnalyzer.analyzeMood());
    }

    @Test
    public void givenMessage_whenNULL_shouldThrowExc(){
        moodAnalyzer = new MoodAnalyzer(null);
        try{
            moodAnalyzer.analyzeMood();
        }catch (MoodAnalysisException e){
            Assert.assertEquals( "Invalid Mood.", e.getMessage());
        }
    }

    @Test
    public void givenMessage_whenEmpty_shouldThrowExc(){
        moodAnalyzer = new MoodAnalyzer(" ");
        try{
            moodAnalyzer.analyzeMood();
        }catch (MoodAnalysisException e){
            Assert.assertEquals("Invalid Mood.", e.getMessage());
        }
    }
}