import java.net.*;
import java.io.*;

// This was practice understanding how URL requests work

public class URLRequest {
    public static void main(String[] args) throws Exception {

        URL urlSrc = new URL("https://api.weather.gov/points/40.5332,-111.9213");
        BufferedInputStream in = new BufferedInputStream((urlSrc.openStream()));

        FileOutputStream fileOut = new FileOutputStream("images/test.json");
        final byte data[] = new byte[1024];
        int count;
        while ((count = in.read(data, 0, 1024)) != -1){
            fileOut.write(data, 0, count);
        }

        in.close();
        fileOut.close();

        /*BufferedReader in = new BufferedReader(new InputStreamReader(urlSrc.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            if (inputLine.equals("    \"properties\": {"))
                    System.out.println(inputLine);*/
    }
}