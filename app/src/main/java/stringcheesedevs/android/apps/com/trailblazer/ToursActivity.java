package stringcheesedevs.android.apps.com.trailblazer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import stringcheesedevs.android.apps.com.trailblazer.Models.Artist;
import stringcheesedevs.android.apps.com.trailblazer.Models.Tour;

public class ToursActivity extends AppCompatActivity {

    public List<Tour>tours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
        //TODO Set this load to load from BuzzAngle / Use Samuels Algo
        setTours("hi");

        ArrayAdapter adapter = new ArrayAdapter<>(this,
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
