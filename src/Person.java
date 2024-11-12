public class Person
{
    public Person(){}

    protected String navn;
    protected String nationalitet;
    protected int foedeAar;
    protected int doedsAar;


    public Person(String navn, String nationalitet, int foedeAar, int doedsAar)
    {
        this.navn = navn;
        this.nationalitet = nationalitet;
        this.foedeAar = foedeAar;
        this.doedsAar = doedsAar;
    }

    public String getNavn()
    {
        return navn;
    }

    public String getNationalitet()
    {
        return nationalitet;
    }

    public int getFoedeAar()
    {
        return foedeAar;
    }

    public int getDoedsAar()
    {
        return doedsAar;
    }

}
