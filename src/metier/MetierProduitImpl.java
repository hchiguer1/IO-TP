package metier;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{

    List<Produit>produits=new ArrayList<>();
    @Override
    public void add(Produit a) {
        produits.add(a);
    }

    @Override
    public List<Produit> getAll(){
        List <Produit> produitLst =new ArrayList<>();

        try{File file=new File("prodsList.txt");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Produit p1=(Produit) ois.readObject();
        produitLst.add(p1);
        Produit p2=(Produit) ois.readObject();
        produitLst.add(p2);
        Produit p3=(Produit) ois.readObject();
        produitLst.add(p3);
        Produit p4=(Produit) ois.readObject();
        produitLst.add(p4);}catch (Exception e){
            System.out.println(e.getMessage());
        }
        return produitLst;
    }

    @Override
    public Produit findById(long id) {
        for(Produit p:produits)
            if (id == p.getId())
                return p;

                return null;
    }

    @Override
    public void delete(long id) {
            Produit p=findById(id);
            produits.remove(p);
    }

    @Override
    public String toString(){
        String m="";
        for (Produit p:produits){
            m+=p.toString();
        }
        return m;
    }

    @Override
    public void saveAll() throws Exception {
        String ligne=null;
        File f1=new File("prodsList.txt");
        FileOutputStream fos=new FileOutputStream(f1);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        for(Produit p:produits)
            oos.writeObject(p);

        System.out.println("every thing is okey");
        fos.close();
        oos.close();

        /*FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        for(Produit p:produits){
            while((ligne=p.toString())!=null){
                bw.write(ligne);
                bw.newLine();
                System.out.println("everything is good");

            }
        }*/
    }

}


