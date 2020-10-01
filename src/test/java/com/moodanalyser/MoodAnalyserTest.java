package com.moodanalyser;
import org.junit.Assert;
import org.junit.Test;
import com.moodanalysernew.MoodAnalyser;

public class MoodAnalyserTest {
	@Test
	public void givenMeassage_WhenSad_ShouldReturnSad() {
		MoodAnalyser mooddetect = new MoodAnalyser();
		String mood = mooddetect.analyseMood("This is sad message");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser mooddetect = new MoodAnalyser();
		String mood = mooddetect.analyseMood("This is happy message");
		Assert.assertEquals("HAPPY", mood);
	}
}
