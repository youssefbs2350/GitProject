import Entite.Produit;

public class TestTableau {
    public static void main(String[] args) {
        // modification tableau par Samar
        int []   tab=new int[4]; //modification taille tableau
        tab[0]=12;
        tab[1]=5;
        tab[2]=67;
        tab[3]=20; // Ajout élement
        for(int i=0;i<tab.length;i++)
        {

            System.out.println("Tab :"+tab[i]);
        }

        int [] tab1={12,5,6};
        for(int i=0;i<tab1.length;i++)
        {

            System.out.println("Tab :"+tab1[i]);
        }
        String [] tab2=new String[2];
        for(int i=0;i<tab2.length;i++)
        {

            System.out.println("Tab :"+tab2[i]);
        }
        tab2[0]="teee";
        tab2[1]="rrf";

        String [] tab3={"ffff","'gghh","glhhl"};

        Produit[] tabpr=new Produit[2];

        Produit p1=new Produit();
        tabpr[0]=p1;

    }
}
