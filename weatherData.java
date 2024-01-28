import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;
import java.util.Map;
import java.util.Iterator;

import org.json.simple.parser.*;
import org.json.simple.JSONObject;

public class weatherData {
    /**********************************************************************************/
    /* THIS IS LEFT UNIMPLEMENTED UNTIL I CAN (hopefully) UNDERSTAND THE REST OF THIS */
    /**********************************************************************************/
    public int temperatureHigh;
    public int temperatureLow;
    public String weatherType;
    public void getWeatherData() throws Exception {
        /* throws Exception is helping avoid a MalformedURL error (even though the URL works??), not sure what causes it.
         * Create new URL here (can pass a string, might later from user input)
         */
        URL urlSrc = new URL("https://api.weather.gov/gridpoints/SLC/98,165/forecast");
        BufferedInputStream in = new BufferedInputStream((urlSrc.openStream()));

        FileOutputStream fileOut = new FileOutputStream("images/test.json");
        final byte data[] = new byte[1024];
        int count;
        // Reads in file data 1024 bytes at a time
        while ((count = in.read(data, 0, 1024)) != -1){
            fileOut.write(data, 0, count);
        }

        in.close();
        fileOut.close();

        Object dummyObject = new JSONParser().parse(new FileReader("images/test.json"));

        // Typecasting dummyObject to a JSONObject, guess a JSONParser can't be this?
        JSONObject jo = (JSONObject) dummyObject;

    }

    public static void main(String args[]) throws Exception{
        URL urlSrc = new URL("https://api.weather.gov/gridpoints/SLC/98,165/forecast");
        BufferedInputStream in = new BufferedInputStream((urlSrc.openStream()));

        FileOutputStream fileOut = new FileOutputStream("images/test.json");
        final byte data[] = new byte[1024];
        int count;
        // Reads in file data 1024 bytes at a time
        while ((count = in.read(data, 0, 1024)) != -1){
            fileOut.write(data, 0, count);
        }

        in.close();
        fileOut.close();

        Object dummyObject = new JSONParser().parse(new FileReader("images/test.json"));

        // Typecasting dummyObject to a JSONObject, guess a JSONParser can't be this?
        JSONObject jo = (JSONObject) dummyObject;

        // Map object helps map values from "properties" (HashMap is unordered like JSON)
        // I don't understand what's going on here, to be honest. ¯\_(ツ)_/¯ Oh well.
        
        // Map properties = ((Map) jo.get("properties"));
        // Map.Entry dataPair = (Map.Entry)iterator.next;

        String sky = jo.get("properties").toString();
        System.out.println(sky);
    }
}