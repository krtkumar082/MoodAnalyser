package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import com.moodanalysernew.MoodAnalyserException;
import com.moodanalysernew.MoodAnalyser;

import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	@Test
	public void givenMeassage_WhenSad_ShouldReturnSad() throws MoodAnalyserException{
		MoodAnalyser mooddetect = new MoodAnalyser("This is sad message");
		String mood = mooddetect.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalyserException{
		MoodAnalyser mooddetect = new MoodAnalyser("This is happy message");
		String mood = mooddetect.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNull() throws MoodAnalyserException {
		MoodAnalyser mooddetect = new MoodAnalyser(null);
		try {
			ExpectedException e = ExpectedException.none();
			e.expect(NullPointerException.class);
		} catch (Exception e) {
			e.printStackTrace();
			String mood = mooddetect.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		}
	}
	@Test
	public void givenMsg_When_Empty() throws MoodAnalyserException {
		MoodAnalyser mooddetect = new MoodAnalyser("");
		try {
		ExpectedException e = ExpectedException.none();
		e.expect(MoodAnalyserException.class);
		mooddetect.analyseMood();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
