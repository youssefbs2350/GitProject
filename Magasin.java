public class Magasin {

    int identifiant;
    String adresse;
    ind id ;

    final int CAPACITE_PRD=50;

    Produit [] tabprod=new Produit[CAPACITE_PRD];

    int compprod;

    public Magasin()
    {}

    public Magasin(int id,String ad ,int id)
    {
        identifiant=id;
        adresse=ad;

    }
//ajout get chaima
    public int getCAPACITE_PRD() {
        return CAPACITE_PRD;
    }
    //ajout set chaima 

    public void setCompprod(int compprod) {
        this.compprod = compprod;
    }

    public void ajouter(Produit p)
    {
       if(compprod<CAPACITE_PRD) {
           tabprod[compprod] = p;
           compprod++;
           System.out.println("produit ajouté ");
       }
       else{

           System.out.println("Magasin plein");
       }
    }
    public void afficher()
    {

        System.out.println("identifiant :"+this.identifiant+"adresse :"+adresse);
        for (int i=0;i<compprod;i++)
        {


            System.out.println("prix :"+tabprod[i].prix);
            System.out.println("libelle :"+tabprod[i].libelle);

            

            System.out.println("Identifiant :"+tabprod[i].identifiant);
            System.out.println("date :"+tabprod[i].dateexp);

            System.out.println("Marque :"+tabprod[i].marque);

        }
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", CAPACITE_PRD=" + CAPACITE_PRD +
                '}';
    }
}
