package stringcheesedevs.android.apps.com.trailblazer.APILoadServices;

import android.support.annotation.NonNull;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
//import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Setlist.Setlist_;
import stringcheesedevs.android.apps.com.trailblazer.Models.City;
import stringcheesedevs.android.apps.com.trailblazer.Utils.NamesUtils;

import static stringcheesedevs.android.apps.com.trailblazer.CustomAutoCompleteTextChangedListener.TAG;

public class APILoader {

    public static String buzzanglebase = "";
    public static String umgbase = "";
    public static String setlistbase = "https://api.setlist.fm/rest/";

    private static Retrofit retrofit = null;
    private final static String buzzanglekey = "";
    private final static String umgkey = "";
    private final static String setlistkey = "cd0dc450-b5ca-4d12-9f1e-410e19057f50";

    public static void main(String [] args) throws IOException {
        for (int i = 0; i < NamesUtils.names.length; i++){
            String name = "";
            String[] arr = NamesUtils.names[i].split(" ");
            for (int j = 0; j < arr.length - 1; j++)
                name += arr[j] + "%20";
            name+=arr[arr.length - 1];
            ProcessBuilder helpMe = new ProcessBuilder("curl", "-X", "GET", "https://api.buzzanglemusic.com/v2/artists/find?query=" + name, "-H", "accept: application/json", "-H", "api-key: 8A08BBCC-9553-47B2-A56E-03C6F53AD6E4");
            Process beingForcedIntoThis = helpMe.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(beingForcedIntoThis.getInputStream()));
            String line = reader.readLine();
            while (line!=null)
            {
                int ind = line.indexOf("artist.cfm?id=");
                ind += 14;
                int endInd = ind;
                while (line.charAt(endInd) != '"')
                    endInd++;
                loadBuzz(Integer.parseInt(line.substring(ind, endInd)));
                line = reader.readLine();
            }

        }

    }
    public static void loadBuzz(int artistID)
    {
        double[] avgs = new double[5];
        try
        {
            String []weeks = {"2019-03-01"
            ,"2019-03-08"
            ,"2019-02-22"
            ,"2019-02-15"};

            for(String week:weeks){
                ProcessBuilder pb = new ProcessBuilder("curl", "-X", "GET", "https://api.buzzanglemusic.com/v2/artists/"+artistID+"/market/country/US?date="+week, "-H", "accept: application/json", "-H", "api-key: 8A08BBCC-9553-47B2-A56E-03C6F53AD6E4");
                Process p = pb.start();
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = reader.readLine();
                while (line!=null)
                {
                    System.out.println(line);
                    line = reader.readLine();
                }
            }


        }
        catch (Exception e)
        {
        }
    }

    public static void loadPrevCities(String s) {
        try
        {

            ProcessBuilder pb = new ProcessBuilder("curl", "-X", "GET", "--header", "Accept:", "application/xml", "--header", "x-api-key: cd0dc450-b5ca-4d12-9f1e-410e19057f50", "https://api.setlist.fm/rest/1.0/artist/" + s + "/setlists?p=1");
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();
            while (line!=null)
            {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (Exception e)
        {

        }

//        Interceptor interceptor = new Interceptor() {
//            @Override
//            public okhttp3.Response intercept(Chain chain) throws IOException {
//                Request newRequest = chain.request().newBuilder().addHeader("api_11key", "cd0dc450-b5ca-4d12-9f1e-410e19057f50").build();
//                return chain.proceed(newRequest);
//            }
//        };
//
//// Add the interceptor to OkHttpClient
//        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        builder.interceptors().add(interceptor);
//        OkHttpClient client = builder.build();
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(setlistbase)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .client(client)
//                    .build();
//        }
//
//        final SetListI setListI = retrofit.create(SetListI.class);
//        Call<List<Setlist_>> call = setListI.listPrevTours(s, 1);
//        final List<City> temp = new ArrayList<>();
//        call.enqueue(new Callback<List<Setlist_>>() {
//            @Override
//            public void onResponse(Call<List<Setlist_>> call, Response<List<Setlist_>> response) {
//                //TODO code that gets Samuel stuff
//                List<City> sets = temp;
//                int i = 0;
//                System.out.println(response.code());
//                for (Setlist_ s : response.body()) {
//                    sets.add(new City(s.getVenue().getUrl(), s.getUrl(), s.getVenue().getCity().getName(), "ALREADY", s.getVenue().getCity().getCoords().getLat(), s.getVenue().getCity().getCoords().getLat()));
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Setlist_>> call, Throwable t) {
//
//            }
//        });
//
//        return temp;
    }
}
