package com.moodanalysernew;

public class MoodAnalyser {
	private String message;
	 
	public MoodAnalyser(){
		
	}
	
	public MoodAnalyser(String message){
		this.message=message;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser");
	}
     
    public  String analyseMood() {
    	    	if(message.contains("sad"))
    	    	  return "SAD";
    	    	else
    	    		return "HAPPY";
    	      }
    	}
     

