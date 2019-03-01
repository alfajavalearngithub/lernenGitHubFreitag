package com.alfa.kunden;

public class Kunde {
	private int kundeNummer;
	private String name;
	private String nachName;
	private String eMailAdresse;
	private String telefonNummer;
	private String strasse;
	private String hausNummer;
	private String plz;
	private String Stadt;
	
	public Kunde(int kundeNummer, String name, String nachName, String eMailAdresse, String telefonNummer,
			String strasse, String hausNummer, String plz, String stadt) {
		this.kundeNummer = kundeNummer;
		this.name = name;
		this.nachName = nachName;
		this.eMailAdresse = eMailAdresse;
		this.telefonNummer = telefonNummer;
		this.strasse = strasse;
		this.hausNummer = hausNummer;
		this.plz = plz;
		Stadt = stadt;
	}
	
	public void rechnungDrucken() {
		
	}
	
	public String getAdress() {
		String adress;
		adress = this.name + " " + this.nachName + "\n";
		adress += this.strasse + " " + this.hausNummer + "\n";
		adress += this.plz + " " + this.Stadt + "\n";
		
		return adress;
	}

	public int getKundeNummer() { return kundeNummer; }
	public void setKundeNummer(int kundeNummer) { this.kundeNummer = kundeNummer; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getNachName() { return nachName;}
	public void setNachName(String nachName) { this.nachName = nachName; }

	public String geteMailAdresse() { return eMailAdresse; }
	public void seteMailAdresse(String eMailAdresse) {this.eMailAdresse = eMailAdresse; }

	public String getTelefonNummer() { return telefonNummer; }
	public void setTelefonNummer(String telefonNummer) { this.telefonNummer = telefonNummer; }

	public String getStrasse() { return strasse; }
	public void setStrasse(String strasse) { this.strasse = strasse; }

	public String getHausNummer() { return hausNummer; }
	public void setHausNummer(String hausNummer) { this.hausNummer = hausNummer; }

	public String getPlz() { return plz; }
	public void setPlz(String plz) { this.plz = plz; }

	public String getStadt() { return Stadt; }
	public void setStadt(String stadt) { Stadt = stadt; }
}
