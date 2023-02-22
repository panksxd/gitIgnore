package Mappere;

import Entitet.*;

import java.util.List;

public class Facade
{
    public static List<Bruger> hentBrugere()
    {
        return BrugerMapper.getBrugerList();
    }
    public static List<Bog> hentBøger()
    {
        return BogMapper.getBogList();
    }
    public static List<Forfatter> hentForfatter()
    {
        return ForfatterMapper.getForfatter();
    }
    public static List<Postnr> hentPostnr()
    {
        return PostnrMapper.getPostnr();
    }
    public static List<Udlån> hentUdlån()
    {
        return UdlånMapper.getUdlån();
    }
}
