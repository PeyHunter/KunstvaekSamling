public class Bog extends Kunstvaerk
{
    public Bog()
    {
    }

    protected String genre;
    protected int antalSider;

    public Bog(String titel, int aar, Person[] ophavsmand, String genre, int antalSider)
    {
        super(titel, aar, ophavsmand);
        this.genre = genre;
        this.antalSider = antalSider;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getAntalSider()
    {
        return antalSider;
    }

}
