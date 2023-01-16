package presentation;
import metier.IMetier;
import metier.MetierProduitImpl;
import metier.Produit;

import java.util.ArrayList;
import java.util.List;

public class Application {
    Produit p=new Produit();
    @Override
    public String toString() {
        String m=new String();
        m+="ID : "+p.getId()+"\n";
        m+="Nom : "+p.getNom()+"\n";
        m+="Marque : "+p.getMarque()+"\n";
        m+="Prix : "+p.getPrix()+"\n";
        m+="Description : "+p.getDescription()+"\n";
        m+="Nombre de Stock : "+p.getNombreStock()+"\n";
        m+="-----------------------\n";
        return m;
    }
    public static void main(String[] args) throws Exception {
        MetierProduitImpl service= new MetierProduitImpl();
        service.add(new Produit(1,"LapTop","Dell",5000,"I3 500Go HDD 4Go DDR4",9 ));
        service.add(new Produit(2,"LapTop","Dell",15000,"I7 500Go SSD 16Go DDR4",5 ));
        service.add(new Produit(3,"LapTop","HP",25000,"I7 1To SSD 32Go DDR5",3 ));
        service.add(new Produit(4,"LapTop","Lenovo",16000,"I7 500Go SSD 16Go DDR5",15 ));

        System.out.println(service);
        System.out.println(service.findById(4l));
        service.delete(2l);
        System.out.println("aprés supression");
        System.out.println(service);
        service.saveAll();
        System.out.println("la Liste lue de Prodlist.txt"+service.getAll());


    }

}
