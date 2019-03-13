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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import stringcheesedevs.android.apps.com.trailblazer.Models.Artist;
import stringcheesedevs.android.apps.com.trailblazer.Models.Tour;
import stringcheesedevs.android.apps.com.trailblazer.Utils.NamesUtils;

public class ToursActivity extends Activity {

    public List<Tour>tours;
    String artistname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
        //TODO this is the artistname
        Intent intent = getIntent();
        String artistname = intent.getStringExtra("artist");
        String artistCode = NamesUtils.artistIDs[Arrays.binarySearch(NamesUtils.names, artistname)];

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

    public void openTour(String tourname){
        Intent intent = new Intent(this,TourActivity.class);
        intent.putExtra("tourname",tourname);
        startActivity(intent);
    }
}
