import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aufgabe3
{
    public static void main(String[] args)
    {
        File file = null; //Weg dahin
        FileWriter fr = null; //liest den File ein
        BufferedWriter bw = null; //liest mir die Datei
        //wird im try block befüllt
        try
        {
            file = new File("C:\\Users\\sabri\\OneDrive\\Desktop\\Softwareübung\\test2.txt"); // relativer ofrad im project
            if (file.exists())
            {
                System.out.println("File existiert");
            } else
            {
                file.createNewFile();
            }
            fr = new FileWriter(file);
            bw = new BufferedWriter(fr);

            for (int i = 0; i < 5; i++)
            {
                bw.write((i+1)+ System.getProperty("line.separator"));//System.getProperty("line.separator") ist ein Zeilenumbruch
            }

        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            try
            {
                bw.close(); // damit es den geöffneten File schließt - wegen speicher....
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
