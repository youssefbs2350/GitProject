import java.util.Date;
public class Produit {
    int identifiant;
    String libelle,marque;
    float prix;
    Date dateexp;
    public Produit(int id,String libelle,String m)
    {

        this.identifiant=id;
        this.marque=m;
        this.libelle=libelle;
    }

    public Produit(int identifiant,String lib)
    {

        this.identifiant=identifiant;
        libelle=lib;
    }
    public Produit(int identifiant,String lib,Date da)
    {

        this.identifiant=identifiant;
        libelle=lib;
        dateexp=da;
    }
    public Produit(String mar,int id)
    {
        marque=mar;
        identifiant=id;
    }
    public Produit(){}


//Ajout getters et setters
   public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDateexp() {
        return dateexp;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }

    public void afficher()


    public void afficherproduit()

    {
        System.out.println("Produit"); // ajouté par Samar
        System.out.println("identifiant :"+this.identifiant);
        System.out.println("prix :"+prix);
        System.out.println("libelle :"+libelle);
        System.out.println("marque :"+marque);
    }
    public String toString()
    {

        return "identifiant :"+identifiant+" marque :"
                +marque+" libelle :"+libelle+" prix :"
                +prix+"Date expiration :"+dateexp;
    }
}
