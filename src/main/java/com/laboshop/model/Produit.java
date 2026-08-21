package com.laboshop.model;

import java.time.LocalDate;

public class Produit implements Ivendable{
    /**contient le suffixe de reference de produit*/
    private static final String SUFFIXE="PRD";

    /** contient le suffixe des references de produit*/
    private static int nombreTotalDeProduit=0;

    private String reference;
    private String libelle;
    private int quantiteEnStock;
    private double prixUnitaire;
    private final LocalDate dateAjout;

    public Produit(double prixUnitaire, String libelle, String reference, LocalDate dateAjout) {
        this.prixUnitaire = prixUnitaire;
        this.libelle = libelle;
        this.dateAjout = dateAjout;
        dateAjout=LocalDate.now();
        nombreTotalDeProduit++;
        reference=SUFFIXE+String.format("%05d",nombreTotalDeProduit);

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public static int getNombreTotalDeProduit(){
        return nombreTotalDeProduit;
    }
    protected void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDateAjout() {
        return dateAjout;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    protected void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    /**
     * retire de la quantite en stock le nombre de produit vendu.
     * @param quantite
     */
    @Override
    public void vendre(int quantite){
      if (quantite<=0){
          System.out.println("la quantite ne peut etre negatif ou null");
      }quantiteEnStock-=quantite;
      journaliser("vendre", quantite );
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

