package com.laboshop.repository;

import com.laboshop.model.Produit;

import java.util.List;

public interface ProduitRepository {
    public Produit save(Produit produit);
    public List<Produit> getAll();
    public Produit findById(String reference);
    public Produit deleteById (String reference);
    public void updateById(String reference , Produit produit) ;
    public boolean existById(String reference);
}
