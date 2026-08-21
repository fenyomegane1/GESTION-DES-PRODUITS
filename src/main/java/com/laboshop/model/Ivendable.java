package com.laboshop.model;

/**
 * presente les differentes actions que peut realiser tout objet vendable
 */
public interface Ivendable {
    /**
     * retire de la  quantite en stock le nombre de produit vendu
     * @param quantite
     */
    public void vendre(int quantite);

    /**
     * ajoute la quantite de produit au stock
     * @param quantinte
     */
    public void reapprovisionner(int quantinte);

    /**
     * permet de donner l'historique de application
     * @param typeOperation
     * @param quantite
     */
    default void journaliser (String typeOperation, int quantite){
        System.out.println("[log] Operation:%-10s montant:%2f FCFA%n, typeOperation,quantite ");
    }

    String getReference();
}
