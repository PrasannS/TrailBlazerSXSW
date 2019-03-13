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
import java.util.Scanner;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Setlist.Setlist_;
import stringcheesedevs.android.apps.com.trailblazer.Models.City;

import static stringcheesedevs.android.apps.com.trailblazer.CustomAutoCompleteTextChangedListener.TAG;

public class APILoader {

    public static String buzzanglebase = "";
    public static String umgbase = "";
    public static String setlistbase = "https://api.setlist.fm/rest/";

    private static Retrofit retrofit = null;
    private final static String buzzanglekey = "";
    private final static String umgkey = "";
    private final static String setlistkey = "cd0dc450-b5ca-4d12-9f1e-410e19057f50";

    public static void main(String [] args){
        loadPrevCities("6041bca6-d070-4894-8019-da9538f2c33d");
    }

    public static List<City> jsonparse(String json){
        Scanner scan = new Scanner(json);
        String line ="";
        City cur = new City();
        List<City> cities = new ArrayList<>();
        while(scan.hasNextLine()){
            line = scan.nextLine();
            if(line.contains("city id")){
                cur.setName(line.substring(line.indexOf("name")+6,line.indexOf("state")-1));
            }
            else if(line.contains("coords")) {
                cur.setLatitude(Double.parseDouble(line.substring(line.indexOf('=')+2,line.indexOf("long")-2)));
                cur.setLongitude(Double.parseDouble(line.substring(line.lastIndexOf("=")+2,line.indexOf('>')-2)));
                cities.add(cur);
                cur = new City();
            }

            //if(line.contains())
        }
        return cities;

    }


    public static List<City> loadPrevCities(String s) {
        String temp = "";
        try
        { ProcessBuilder pb = new ProcessBuilder("curl", "-X", "GET", "--header", "Accept:", "application/xml", "--header", "x-api-key: cd0dc450-b5ca-4d12-9f1e-410e19057f50", "https://api.setlist.fm/rest/1.0/artist/6041bca6-d070-4894-8019-da9538f2c33d/setlists?p=1");
        Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                temp+=line;
                line = reader.readLine();
            }


        }
        catch (Exception e)
        {

        }

        return jsonparse(temp);

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
