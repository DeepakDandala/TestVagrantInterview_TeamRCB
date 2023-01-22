package com.testvagrantinterview.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetJSON {

	private JSONObject jo;
	private JSONArray allPlayers;
	private JSONObject player;

	protected JSONObject getJSONData() throws IOException, ParseException {

		File jsonFile = new File(
				System.getProperty("user.dir") + "/src/main/resources/RCBPlayersList/RCBPlayersList.json");
		FileReader fr = new FileReader(jsonFile);
		JSONParser jp = new JSONParser();
		Object o = jp.parse(fr);
		jo = (JSONObject) o;
		return jo;
		
	}

	public int getNumberOfForeignPlayers() throws IOException, ParseException {

		int numberOfForeignPlayers = 0;
		String nationality;
		JSONObject jo = getJSONData();
		allPlayers = (JSONArray) jo.get("player");
		for (Object ob : allPlayers) {
			player = (JSONObject) ob;
			nationality = (String) player.get("country");
			if (!nationality.equals("India")) {
				numberOfForeignPlayers = numberOfForeignPlayers + 1;
			}
		}
		return numberOfForeignPlayers;

	}

	public int getNumberOfWicketKeepers() throws IOException, ParseException {

		int numberOfWicketKeepers = 0;
		String playerRole;
		JSONObject jo = getJSONData();
		allPlayers = (JSONArray) jo.get("player");
		for (Object ob : allPlayers) {
			player = (JSONObject) ob;
			playerRole = (String) player.get("role");
			if (playerRole.equals("Wicket-keeper")) {
				numberOfWicketKeepers = numberOfWicketKeepers + 1;
			}
		}
		return numberOfWicketKeepers;

	}

}
