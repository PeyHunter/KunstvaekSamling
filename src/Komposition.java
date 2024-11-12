public class Komposition extends Kunstvaerk
{
    public Komposition() {}

    protected String genre;
    protected int spilletid;



    public Komposition(String titel, int aar, String genre, int spilletid)
    {
        super(titel, aar, new Person[5]);  // Call the Kunstvaerk constructor
        this.genre = genre;
        this.spilletid = spilletid;
    }




    public String getGenre(){
        return genre;
    }

    public int getSpilletid()
    {
        return spilletid;
    }
}
