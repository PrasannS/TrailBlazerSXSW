package stringcheesedevs.android.apps.com.trailblazer.Utils;

import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.w3c.dom.Document;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Timer;
import java.util.TimerTask;
import java.util.jar.Attributes;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class IDLoader
{
    public static Timer timer = new Timer();
    public static int cur = 0;
    public static void main(String[] args)
    {
        startQuery();
    }
    public static void startQuery()
    {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (cur > NamesUtils.names.length)
                    stopQuery();
                String s = NamesUtils.names[cur];
                int ind = 0;
                int holdInd = 0;
                while (holdInd < s.length() && s.charAt(holdInd) != '(')
                {
                    if (s.charAt(holdInd) != ' ')
                        ind = holdInd;
                    holdInd++;
                }
                getArtistId(s.substring(0,ind + 1));
                cur++;
            }
        },500,500);
    }
    public static void stopQuery()
    {
        timer.cancel();
    }
    public static String getArtistId(String s)
    {
        try {
            String[] arr = s.split(" ");
            String add = "";
            for (int i = 0; i < arr.length - 1; i++)
                add += arr[i] + "%20";
            add+=arr[arr.length - 1];
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
            if (ind == 10)
                ind = str.indexOf("artists\":[{\"id") + 17;
            if (ind == 16)
                System.out.println(NamesUtils.names[cur] + " NONEXISTANT");
            int indEnd = ind;
            while (str.charAt(indEnd) != '"')
                indEnd++;
            String id = str.substring(ind, indEnd);

            System.out.println("\"" + id + "\",");
            return id;
        }
        catch (Exception e)
        {
            cur--;
            return "";
        }

    }

}
