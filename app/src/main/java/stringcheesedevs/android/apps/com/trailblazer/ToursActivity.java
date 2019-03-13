package stringcheesedevs.android.apps.com.trailblazer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import stringcheesedevs.android.apps.com.trailblazer.APILoadServices.APILoader;
import stringcheesedevs.android.apps.com.trailblazer.Models.Artist;
import stringcheesedevs.android.apps.com.trailblazer.Models.City;
import stringcheesedevs.android.apps.com.trailblazer.Models.DaoSession;
import stringcheesedevs.android.apps.com.trailblazer.Models.Tour;
import stringcheesedevs.android.apps.com.trailblazer.Utils.NamesUtils;

public class ToursActivity extends Activity {

    public List<Tour>tours;
    String artistname;
    public DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
        //TODO this is the artistname
        Intent intent = getIntent();
        String artistname = intent.getStringExtra("artist");
        String artistCode = NamesUtils.artistIDs[Arrays.binarySearch(NamesUtils.names, artistname)];
        daoSession = ((TBApplication)getApplication()).getDaoSession();
        List<City>cities = null;
        try {
            cities = APILoader.loadPrevCities(artistCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(City c:cities){
            daoSession.getCityDao().save(c);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.listview, getTourNames());

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

    }

    public void setTours(String artistname) {
        tours =  new ArrayList<>();
    }

    public String[] getTourNames(){
        String[] as = new String[tours.size()];
        int cur = 0;
        for (Tour a:tours){
            as[cur] = a.getName();
            cur++;
        }
        return as;
    }
}
