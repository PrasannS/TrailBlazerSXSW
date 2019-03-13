package stringcheesedevs.android.apps.com.trailblazer.Utils;

import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.w3c.dom.Document;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class IDLoader
{
    public static void main(String[] args)
    {
        getArtistId("Michael Jackson");
    }
    public static String getArtistId(String s)
    {
        try {
            String[] arr = s.split(" ");
            String add = "";
            for (int i = 0; i < arr.length - 1; i++)
                add += arr[i] + "%20";
            add+=arr[arr.length - 1];
            System.out.println("RUN");
            String a = "http://musicbrainz.org/ws/2/artist/?query=artist:" + add;
            URL url = new URL(a);
            URLConnection si=url.openConnection();
            InputStream is=si.getInputStream();
            String str="";
            int i;
            while((i=is.read())!=-1){
                str +=str.valueOf((char)i);
            }
            int ind = str.indexOf("artist id") + 11;
            int indEnd = ind;
            while (str.charAt(indEnd) != '"')
                indEnd++;
            String id = str.substring(ind, indEnd);

            System.out.print(id);
            return id;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "";
        }
    }

}
