package com.moodanalysernew;

public class MoodAnalyserException extends Exception {
	public enum expectedType{
		Null_EXCEPTION, EMPTY_EXCEPTION
	}
	
	public MoodAnalyserException(expectedType type , String msg) {
		super(msg);
		System.out.println(type);
	}
}
