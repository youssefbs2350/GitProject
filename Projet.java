public class Projet {
    String name;
    int id;

    Developpeur dev;

    public Projet(String name){
        this.name=name;
    }
    public Projet(String name,Developpeur dev)
    {
        this.name=name;
        this.dev=dev;
    }
    public String toString()
    {

        return "name :"+name+" dev "+dev;
        System.out.println("projet modifié");
    }
}
