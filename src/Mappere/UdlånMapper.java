package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Udlån;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UdlånMapper
{
    protected static List<Udlån> getUdlån()
    {
        List<Udlån> udlånList = new ArrayList<>();
        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tirsdag_bib.udlån;");
            ResultSet result = statement.executeQuery();

            while(result.next())
            {
                int idudlån = result.getInt("idudlån");
                int bogID = result.getInt("bogID");
                int brugerID = result.getInt("brugerID");

                Udlån udlån = new Udlån(idudlån, bogID, brugerID);
                udlånList.add(udlån);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return udlånList;
    }
}
