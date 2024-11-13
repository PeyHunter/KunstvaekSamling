import java.lang.reflect.Array;
import java.util.ArrayList;

public class KunstvaerkSamling
{
    public KunstvaerkSamling()
    {
    }


    protected ArrayList<Kunstvaerk> kunstvaerker = new ArrayList<>();




    public void add(Kunstvaerk k)
    {
        kunstvaerker.add(k);
    }

    public ArrayList<Kunstvaerk> getKunstvaerker()
    {
        return kunstvaerker;
    }



    public void udskrivKunstvaerker() {
        for (int i = 0; i < kunstvaerker.size(); i++) {
            Kunstvaerk k = kunstvaerker.get(i);

            System.out.println(
                    " Værk " + k.getTitel() +
                    " Aar " + k.getAar() +
                    " ophavsman: " + k.getPersonNavn());
        }
    }





























    public void findSangeMedFlereKomponister()
    {
        for (int i = 0; i < kunstvaerker.size(); i++)
        {
            Kunstvaerk k = kunstvaerker.get(i);
            if (k instanceof Komposition && k.antalOphavsmaend > 1)
                System.out.println(k.getTitel());
        }
    }


    public void findSangeMedEnKomponist()
    {
        for (int i = 0; i < kunstvaerker.size(); i++)
        {
            Kunstvaerk k = kunstvaerker.get(i);
            if (k instanceof Komposition && k.getAntalOphavsmaend() == 1)
            {
                System.out.println(k.getTitel());
            }
        }
    }


    public void findMalerierPaaMuseum(String museumNavn)
    {
        for (int i = 0; i < kunstvaerker.size(); i++)
        {
            Kunstvaerk k = kunstvaerker.get(i);

            if (k instanceof Maleri)
            {
                Maleri m = (Maleri) k; //explicit cast
                String malerietsMuseum = m.getMuseum().getNavn();

                // Check if it's in the specified museum
                if (malerietsMuseum.equals(museumNavn))
                    System.out.println(m.getTitel());
            }
        }
    }

    public void beregnAntalLaesteSider()
    {

        int totalsider = 0;
        for (int i = 0; i < kunstvaerker.size(); i++)
        {
            Kunstvaerk k = kunstvaerker.get(i);
            if (k instanceof Bog)
            {
                Bog b = (Bog) k;
                totalsider += b.getAntalSider();
            }
        }
        System.out.println(totalsider);
    }


    public void skrivBogNavn()
    {
        String bognavn = "";
        for (int i = 0; i < kunstvaerker.size(); i++)
        {
            Kunstvaerk k = kunstvaerker.get(i);
            if (k instanceof Bog)
            {
                Bog b = (Bog) k;
                bognavn = b.getTitel();
                System.out.println(bognavn);
            }
        }
    }
}


