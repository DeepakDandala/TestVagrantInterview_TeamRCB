package com.testvagrantinterview.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testvagrantinterview.utilities.GetJSON;

public class ForeignPlayersTest {
	
	@Test(description="This test verfies that there are only four foreign players in the RCB team")
	public void verifyNumberOfForeignPlayers() throws IOException, ParseException {
		GetJSON gj = new GetJSON();
		int foreignPlayerCount = gj.getNumberOfForeignPlayers();
		Assert.assertTrue(foreignPlayerCount==4);
		
	}

}
