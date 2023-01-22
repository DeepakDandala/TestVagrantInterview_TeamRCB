package com.testvagrantinterview.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testvagrantinterview.utilities.GetJSON;

public class WicketKeepersTest {
	
	@Test(description="This test verfies that there is at least one wicket keeper in the RCB team")
	public void verifyNumberOfWicketKeepers() throws IOException, ParseException {
		GetJSON gj = new GetJSON();
		int wicketKeeperCount = gj.getNumberOfWicketKeepers();
		Assert.assertTrue(wicketKeeperCount>=1);
		
	}

}
