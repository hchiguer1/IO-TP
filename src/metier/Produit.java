package metier;

import java.io.Serializable;

public class Produit implements Serializable {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private long nombreStock;

    public Produit(long id, String nom, String marque, double prix, String description, long nombreStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreStock = nombreStock;
    }
    public Produit(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNombreStock() {
        return nombreStock;
    }

    public void setNombreStock(long nombreStock) {
        this.nombreStock = nombreStock;
    }
    @Override
    public String toString(){
        String m="------------------------\n";
        m+="ID : "+this.getId()+"\n";
        m+="Nom : "+this.getNom()+"\n";
        m+="Marque : "+this.getMarque()+"\n";
        m+="Prix : "+this.getPrix()+"\n";
        m+="Description : "+this.getDescription()+"\n";
        m+="Nombre de Stock : "+this.getNombreStock()+"\n";
        return m;
    }
}
