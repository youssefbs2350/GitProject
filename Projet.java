public class Projet {
    String name;
     public int ; //modification par islem
    Developpeur dev;
    //modification par islem
    Public String getName (){
        return name;

    }

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
    }
}
