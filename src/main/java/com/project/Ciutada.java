package com.project;

import java.io.Serializable;

public class Ciutada implements Serializable {

	private long ciutadaId;
	private long ciutatId;
	private String nom;
	private String cognom;
	private int edat;

	public Ciutada() { }

	public Ciutada(long ciutatId, String nom, String cognom, int edat) {
		this.nom = nom;
		this.ciutatId = ciutatId;
		this.cognom = cognom;
		this.edat = edat;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getCognom() {
		return cognom;
	}

	public int getEdat() {
		return edat;
	}

	public long getCiutadaId() {
		return this.ciutadaId;
	}

	public void setCiutadaId(long id) {
		this.ciutadaId = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCiutatId (long ciutatId) {
		this.ciutatId = ciutatId;
	}

	public long getCiutatId () {
		return this.ciutatId;
	}

	@Override
    public String toString () {
      	return this.getCiutadaId() + ": " + this.getNom() + " " + this.getCognom() + ", " + this.getEdat() + " - " + this.getCiutatId();
    }
}