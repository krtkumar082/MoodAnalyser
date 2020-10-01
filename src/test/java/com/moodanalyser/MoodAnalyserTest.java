package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import com.moodanalysernew.MoodAnalyser;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	@Test
	public void givenMeassage_WhenSad_ShouldReturnSad() {
		MoodAnalyser mooddetect = new MoodAnalyser("This is sad message");
		String mood = mooddetect.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser mooddetect = new MoodAnalyser("This is happy message");
		String mood = mooddetect.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNull() {
		try {
			MoodAnalyser mooddetect = new MoodAnalyser(null);
			ExpectedException e = ExpectedException.none();
			e.expect(NullPointerException.class);
			String mood = mooddetect.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
