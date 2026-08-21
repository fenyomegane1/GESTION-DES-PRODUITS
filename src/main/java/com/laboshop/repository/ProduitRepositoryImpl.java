package com.laboshop.repository;

import com.laboshop.model.Produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProduitRepositoryImpl implements ProduitRepository{
   private static Map<String,Produit>produits=new HashMap<>();

    /**
     *
     * @param produit
     * @return
     */
    @Override
    public Produit save(Produit produit) {
        return produits.put(produit.getReference(), produit);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Produit> getAll() {
        return new ArrayList<>(produits.values());
    }

    /**
     *
     * @param reference
     * @return
     */
    @Override
    public Produit findById(String reference) {
        return produits.get(reference);
    }

    /**
     *
     * @param reference
     * @return
     */
    @Override
    public Produit deleteById(String reference) {
        return produits.remove(reference);
    }

    /**
     *
     * @param reference
     * @param produit
     */
    @Override
    public void updateById(String reference, Produit produit) {
      produits.put(reference,produit);
    }

    /**
     *
     * @param reference
     * @return
     */
    @Override
    public boolean existById(String reference) {
        return produits.containsKey(reference);
    }
}
