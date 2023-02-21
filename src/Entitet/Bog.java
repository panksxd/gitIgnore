package Entitet;

public class Bog
{
    private int idbog;
    private int forfatterid;
    private String titel;

    public Bog(int idbog, int forfatterid, String titel)
    {
        this.idbog = idbog;
        this.forfatterid = forfatterid;
        this.titel = titel;
    }

    public int getIdbog()
    {
        return idbog;
    }

    public void setIdbog(int idbog)
    {
        this.idbog = idbog;
    }

    public int getForfatterid()
    {
        return forfatterid;
    }

    public void setForfatterid(int forfatterid)
    {
        this.forfatterid = forfatterid;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    @Override
    public String toString()
    {
        return "Bog{" +
                "idbog=" + idbog +
                ", forfatterid=" + forfatterid +
                ", titel='" + titel + '\'' +
                '}';
    }
}
