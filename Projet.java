public class Projet {
    String name;
     public int ; //modification par islem
    Developpeur dev;
    //modification par islem
    Public String getName (){
        return name;

    }

    public Projet(String name){
        //test conflit
        this.name=name;
    }
    public Projet(String N,Developpeur dev)
    {
        N=name;//modification islem
        this.dev=dev;
    }
    public String toString()
    {

        return "name :"+name+" dev "+dev;
    }
}
