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
     
    public  String analyseMood() throws MoodAnalyserException{
    	try {
    		if(message.isEmpty()){
				throw new MoodAnalyserException(MoodAnalyserException.expectedType.EMPTY_EXCEPTION, "Empty Exception");
			}
    	    	if(message.contains("sad"))
    	    	  return "SAD";
    	    	else
    	    		return "HAPPY";
    	      
    }catch(NullPointerException e) {
    	throw new MoodAnalyserException(MoodAnalyserException.expectedType.Null_EXCEPTION, "Null Exception");
         }
    }
}
     

