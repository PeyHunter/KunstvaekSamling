public class Maleri extends Kunstvaerk
{
    public Maleri()
    {
    }

    protected int laengde;
    protected int bredde;
    protected Museum museum;


    public Maleri(String titel, int aar, int laengde, int bredde, Museum museum)
    {
        super(titel, aar, new Person[5]);
        this.laengde = laengde;
        this.bredde = bredde;
        this.museum = museum;
    }



}
