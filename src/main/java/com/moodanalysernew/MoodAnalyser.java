package com.moodanalysernew;

public class MoodAnalyser {
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser");
	}
     
    public static String analyseMood(String message) {
    	    	if(message.contains("sad"))
    	    	  return "SAD";
    	    	else
    	    		return "HAPPY";
    	      }
    	}
     

