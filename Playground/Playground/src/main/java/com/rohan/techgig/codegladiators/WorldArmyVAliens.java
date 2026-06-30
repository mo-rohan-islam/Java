package com.rohan.techgig.codegladiators;

import java.util.Scanner;

public class WorldArmyVAliens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String launchTimeS = scan.nextLine();
		String travelTimeS = scan.nextLine();

		launchTimeS = launchTimeS.trim();
		travelTimeS = travelTimeS.trim();

		int launchHour = Integer.parseInt(launchTimeS.substring(0, 2));
		int launchMin = Integer.parseInt(launchTimeS.substring(3));
		int travelHour = Integer.parseInt(travelTimeS.substring(0, 2));
		int travelMin = Integer.parseInt(travelTimeS.substring(3));

		int destroyMin = (launchMin + travelMin) % 60;
		int destroyHour = (launchHour + travelHour + (launchMin + travelMin) / 60) % 24;

		String finalHour = "", finalMin = "";
		if (destroyHour < 10) {
			finalHour = "0" + destroyHour;
		} else {
			finalHour = "" + destroyHour;
		}

		if (destroyMin < 10) {
			finalMin = "0" + destroyMin;
		} else {
			finalMin = "" + destroyMin;
		}

		System.out.println(finalHour + " " + finalMin);

		scan.close();

	}

}
