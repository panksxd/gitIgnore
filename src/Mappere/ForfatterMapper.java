package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Forfatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ForfatterMapper
{
    protected List<Forfatter> getForfatter()
    {
        List<Forfatter> forfatterList = new ArrayList<>();
        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tirsdag_bib.forfatter;");
            ResultSet result = statement.executeQuery();

            while(result.next())
            {
                int idforfatter = result.getInt("idforfatter");
                String navn = result.getString("navn_forfatter");

                Forfatter forfatter = new Forfatter(idforfatter, navn);
                forfatterList.add(forfatter);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return forfatterList;
    }
}
