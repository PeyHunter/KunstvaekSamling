public class Museum
{
    public Museum()
    {
    }

    protected String navn;
    protected String adresse;

    public Museum(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn()
    {
        return navn;
    }
    public String getAdresse(){
        return adresse;
    }
}
