package Entitet;

public class Udlån
{
    private int idudlån;
    private int bogID;
    private int brugerID;

    public Udlån(int idudlån, int bogID, int brugerID)
    {
        this.idudlån = idudlån;
        this.bogID = bogID;
        this.brugerID = brugerID;
    }

    public int getIdudlån()
    {
        return idudlån;
    }

    public void setIdudlån(int idudlån)
    {
        this.idudlån = idudlån;
    }

    public int getBogID()
    {
        return bogID;
    }

    public void setBogID(int bogID)
    {
        this.bogID = bogID;
    }

    public int getBrugerID()
    {
        return brugerID;
    }

    public void setBrugerID(int brugerID)
    {
        this.brugerID = brugerID;
    }

    @Override
    public String toString()
    {
        return "Udlån{" +
                "idudlån=" + idudlån +
                ", bogID=" + bogID +
                ", brugerID=" + brugerID +
                '}';
    }
}
