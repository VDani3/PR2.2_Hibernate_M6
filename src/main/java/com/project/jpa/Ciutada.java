package com.project.jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Ciutada")
public class Ciutada implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ciutadaId", unique = true, nullable = false)
	private long ciutadaId;

	@Column(name = "ciutatId")
	private long ciutatId;

	@Column(name = "nom")
	private String nom;

	@Column(name = "cognom")
	private String cognom;

	@Column(name = "edat")
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