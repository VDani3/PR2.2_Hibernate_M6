package com.project.jpa;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Ciutat")
public class Ciutat implements Serializable {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name = "ciutatId")
      private long ciutatId;

      @Column(name = "nom")
      private String nom;

      @Column(name = "pais")
      private String pais;
      
      @Column(name = "codiPostal")
      private int codiPostal;

      public Ciutat() {}
    
      public Ciutat(String nom, String pais, int codiPostal) {
         this.nom = nom;
         this.pais = pais;
         this.codiPostal = codiPostal;
      }

      public void setPais(String pais) {
         this.pais = pais;
      }

      public void setCodiPostal(int codiPostal) {
         this.codiPostal = codiPostal;
      }

      public String getPais() {
         return pais;
      }

      public int getCodiPostal() {
         return codiPostal;
      }

      public long getCiutatId() {
         return ciutatId;
      }
    
      public void setCiutatId(long id) {
         this.ciutatId = id;
      }
    
      public String getNom() {
         return nom;
      }
    
      public void setNom(String nom) {
         this.nom = nom;
      }

      @Override
      public String toString () {
         return this.getCiutatId() + ": " + this.getNom() + ", " + this.getPais() + ", "+ this.getCodiPostal();
      }
 }