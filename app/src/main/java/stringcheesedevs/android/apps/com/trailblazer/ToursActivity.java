package stringcheesedevs.android.apps.com.trailblazer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.greenrobot.greendao.query.QueryBuilder;
import stringcheesedevs.android.apps.com.trailblazer.APILoadServices.APILoader;
import stringcheesedevs.android.apps.com.trailblazer.Models.*;
import stringcheesedevs.android.apps.com.trailblazer.Utils.NamesUtils;

public class ToursActivity extends Activity {

    public List<Tour>tours;
    String artistname;
    public DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openTour(getTourNames()[position]);
            }
        });



    }

    public void openTour(String tourname){
        Intent intent = new Intent(this,TourActivity.class);
        intent.putExtra("tourname",tourname);
        startActivity(intent);
    }

    public List<City> getunvisitedCities(Artist a){
        QueryBuilder<City> qb = daoSession.getCityDao().queryBuilder();
        qb.where(qb.and(CityDao.Properties.Artist.eq(a.getName()),CityDao.Properties.TourCode.notEq("ALREADY")));
        return  qb.list();
    }

    //parameter - artist name
    public List<City> getAllCities(String a){
        QueryBuilder<City> qb = daoSession.getCityDao().queryBuilder();
        qb.where(CityDao.Properties.Artist.eq(a));
        return  qb.list();
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

    public boolean isVisited(City c){
        QueryBuilder<City> qb = daoSession.getCityDao().queryBuilder();
        qb.and(CityDao.Properties.Artist.eq(c.getArtist()),CityDao.Properties.TourCode.eq("ALREADY"));
        return  qb.list().size()!=0;
    }

    public void saveData(Tour t, List<City>cities){
        String code = UUID.randomUUID().toString();
        t.setCode(code);
        int cur = 0;
        for(City c : cities){
            c.setPos(cur);
            c.setTourCode(code);
            cur++;
        }
    }
}
