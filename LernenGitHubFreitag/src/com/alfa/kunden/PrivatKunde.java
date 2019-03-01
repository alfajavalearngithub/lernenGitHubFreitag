package com.alfa.kunden;

public class PrivatKunde extends Kunde {
	private int bonitaet;
	public PrivatKunde(int kundeNummer, String name, String nachName, 
			String eMailAdresse, String telefonNummer, String strasse, 
			String hausNummer, String plz, String stadt, int bonitaet) {
		super(kundeNummer, name, nachName, eMailAdresse, telefonNummer, strasse, hausNummer, plz, stadt);
		this.bonitaet = bonitaet;
	}

	@Override
	public void rechnungDrucken() {
		System.out.println("Rechnung Privatkunde");
	}
}
