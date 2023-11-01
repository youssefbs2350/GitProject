public class Projet {
    String name;

    Developpeur dev;

    public Projet(String Test){
        Test=name;
    }
    public Projet(String name,Developpeur dev)
    {
        this.name=name;
        this.dev=dev;
    }
    public String toString()
    {

        return "name :"+name+" dev "+dev;
    }
}
