
import Entitet.Postnr;
import Mappere.*;


public class Main
{
    public static void main(String[] args)
    {
        BrugerMapper brugerMapper = new BrugerMapper();
        BogMapper bogMapper = new BogMapper();
        PostnrMapper postnrMapper = new PostnrMapper();
        ForfatterMapper forfatterMapper = new ForfatterMapper();
        UdlånMapper udlånMapper = new UdlånMapper();
        System.out.println(brugerMapper.getBrugerList());
    }


}
