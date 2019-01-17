import java.io.*;
import java.util.ArrayList;

public class Aufgabe1
{
    public static void main(String[] args)
    {
        File file = null; //Weg dahin
        FileReader fr = null; //liest den File ein
        BufferedReader br = null; //liest mir die Datei
        //wird im try block befüllt
        try
        {
            file = new File("C:\\Users\\sabri\\OneDrive\\Desktop\\Softwareübung\\test.txt"); // relativer ofrad im project
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            ArrayList<String> arrayList = new ArrayList();
            while (true)
            {
                String zeile = br.readLine();
                if (zeile == null)
                {
                    break;
                }
                arrayList.add(zeile);
            }
            for (String s : arrayList)
            {
                System.out.println(s);
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            try
            {
                br.close(); // damit es den geöffneten File schließt - wegen speicher....
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
