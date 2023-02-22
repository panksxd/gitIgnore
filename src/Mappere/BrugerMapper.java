package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Bruger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BrugerMapper
{

    protected static List<Bruger> getBrugerList()
    {
        List<Bruger> brugerList = new ArrayList<>();
        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tirsdag_bib.bruger;");
            ResultSet result = statement.executeQuery();
            while (result.next())
            {
                int id = result.getInt(("idbruger"));
                String navn = result.getString(("navn_bruger"));
                String adresse = result.getString(("adresse"));
                int postnr = result.getInt(("postnr_bruger"));

                Bruger bruger = new Bruger(id, navn, adresse, postnr);
                brugerList.add(bruger);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return brugerList;
    }
}
