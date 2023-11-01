public class Projet {
    String name;

    int id;


     public int ; //modification par islem

    Developpeur dev;
    //modification par islem
    Public String getName (){
        return name;

    }


    public Projet(String Test){
        Test=name;

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
        System.out.println("projet modifié");
    }
}
