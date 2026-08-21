package com.laboshop.model;

import java.time.LocalDate;

public class Produit implements Ivendable{
    /**contient le suffixe de reference de produit*/
    private static final String SUFFIXE="PRD";
    /** contient le suffixe des references de produit*/
    private static final int nombreTotalDeProduit=0;

    private String reference;
    private String libelle;
    private int quantiteEnStock;
    private double prixUnitaire;
    private final LocalDate dateAjout;

    public Produit(double prixUnitaire, String libelle, String reference, LocalDate dateAjout) {
        this.prixUnitaire = prixUnitaire;
        this.libelle = libelle;
        this.reference = reference;
        this.dateAjout = dateAjout;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    protected void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    protected void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public void vendre(int quantite){
      if (quantite<=0){
          System.out.println("la quantite ne peut etre negatif ou null");
      }quantiteEnStock-=quantite;
      journaliser("vendre" );
      }

    private void journaliser(String vendre) {
    }

    @Override
    public void reapprovisionner(int quantinte) {

    }

    @Override
    public void journaliser(String typeOperation, int quantite) {
        Ivendable.super.journaliser(typeOperation, quantite);
    }

    @Override
    public String getReference() {
        return "";
    }


}

