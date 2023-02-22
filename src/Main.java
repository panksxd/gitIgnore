
import Entitet.Postnr;
import Mappere.*;


public class Main
{
    public static void main(String[] args)
    {
        /*BrugerMapper brugerMapper = new BrugerMapper();
        BogMapper bogMapper = new BogMapper();
        PostnrMapper postnrMapper = new PostnrMapper();
        ForfatterMapper forfatterMapper = new ForfatterMapper();
        UdlånMapper udlånMapper = new UdlånMapper();*/
        Facade.hentBrugere();
        Facade.hentBøger();
        Facade.hentForfatter();
        Facade.hentUdlån();
        Facade.hentPostnr();
    }


}
