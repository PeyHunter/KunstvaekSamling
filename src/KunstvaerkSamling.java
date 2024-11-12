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

}
