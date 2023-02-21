package Entitet;

public class Bruger
{
    private int idBruger;
    private String navn;
    private String adresse;
    private int postnr;

    public Bruger(int idBruger, String navn, String adresse, int postnr)
    {
        this.idBruger = idBruger;
        this.navn = navn;
        this.adresse = adresse;
        this.postnr = postnr;
    }

    public int getIdBruger()
    {
        return idBruger;
    }

    public void setIdBruger(int idBruger)
    {
        this.idBruger = idBruger;
    }

    public String getNavn()
    {
        return navn;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public int getPostnr()
    {
        return postnr;
    }

    public void setPostnr(int postnr)
    {
        this.postnr = postnr;
    }

    @Override
    public String toString()
    {
        return "Bruger{" +
                "idBruger=" + idBruger +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnr=" + postnr +
                '}';
    }
}
