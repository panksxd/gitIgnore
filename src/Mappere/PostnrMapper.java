package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Postnr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PostnrMapper
{
    protected static List<Postnr> getPostnr()
    {
        List<Postnr> postnrList = new ArrayList<>();
        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tirsdag_bib.postnr;");
            ResultSet result = statement.executeQuery();
            while(result.next())
            {
                int postnr = result.getInt("postnr");
                String bynavn = result.getString("bynavn");

                Postnr postnr1 = new Postnr(postnr, bynavn);
                postnrList.add(postnr1);
            }
        }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        return postnrList;
    }
}
