import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       // System.out.println(getString("hvad hedder du?"));

       // System.out.println(getInt("angiv venligst din skostørelse"));
        //System.out.println(getInt("angiv venligst din højde"));

        while (true)
        {
            switch (getString("angiv dit ønske"))
            {
                case "låne bog":
                    System.out.println("du ønsker at låne en bog");
                    break;

            }
            if(getString("q for quit").equals("q"))
            {
                break;
            }
        }
    }
    public static String getString(String s)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(s + ": ");
        return scanner.nextLine();
    }
    public static int getInt(String s)
    {
        int res = 0;

        while (true)
        {
            try
            {
            res = Integer.parseInt(getString(s));
            return res;
            }
            catch (Exception e)
            {
                System.out.println("skriv venligst kun tal");
            }
        }
    }
}
