public abstract class Kunstvaerk
{

    public Kunstvaerk()
    {
    }

    protected String titel;
    protected int aar;
    protected int antalOphavsmaend = 0;
    protected Person[] ophavsmand = new Person[5];


    public Kunstvaerk(String titel, int aar)
    {
        this.titel = titel;
        this.aar = aar;
    }


    public String getTitel()
    {
        return titel;
    }

    public int getAar()
    {
        return aar;
    }

    public String getPersonNavn()
    {
        return ophavsmand[0].getNavn();
    }


    public Person[] getOphavsmand()
    {
        return ophavsmand;
    }

    public void addOphavsmand(Person p)
    {
        if (antalOphavsmaend < ophavsmand.length)
        {
            ophavsmand[antalOphavsmaend] = p;
            antalOphavsmaend++;
        }
    }

    public int getAntalOphavsmaend()
    {
        return antalOphavsmaend;
    }


}
