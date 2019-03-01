package com.alfa.kunden;

public class Firma extends Kunde {

	String steuerID;
	int art;
	public Firma(int kundeNummer, String name, String nachName, String eMailAdresse, String telefonNummer,
			String strasse, String hausNummer, String plz, String stadt) {
		super(kundeNummer, name, nachName, eMailAdresse, telefonNummer, strasse, hausNummer, plz, stadt);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void rechnungDrucken() {
		// TODO Auto-generated method stub
		super.rechnungDrucken();
		System.out.println("Firma Rechnung..");
	}
	

}
