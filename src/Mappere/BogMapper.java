package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Bog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BogMapper
{
    protected List<Bog> getBogList()
    {
        List<Bog> bogList = new ArrayList<>();

        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tirsdag_bib.bog;");
            ResultSet result = statement.executeQuery();
            while(result.next())
            {
                int idbog = result.getInt("idbog");
                int forfatterid = result.getInt("forfatterid");
                String titel = result.getString("titel");

                Bog bog = new Bog(idbog, forfatterid, titel);
                bogList.add(bog);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return bogList;
    }
}
