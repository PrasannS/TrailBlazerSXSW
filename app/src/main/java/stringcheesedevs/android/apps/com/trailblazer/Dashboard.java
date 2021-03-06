package stringcheesedevs.android.apps.com.trailblazer;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.sqlite.SQLiteException;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.TextView;

import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

import java.util.List;

import stringcheesedevs.android.apps.com.trailblazer.Models.Artist;
import stringcheesedevs.android.apps.com.trailblazer.Models.ArtistDao;
import stringcheesedevs.android.apps.com.trailblazer.Models.DaoSession;
import stringcheesedevs.android.apps.com.trailblazer.Utils.NamesUtils;

public class Dashboard extends Activity {

    public String cur;
    public TextView wikiframe;
    CustomAutoCompleteView myAutoComplete;

    // adapter for auto-complete
    ArrayAdapter<String> myAdapter;

    // for database operations

    // just to add some initial value
    String[] item = new String[] {"Enter an artist..."};


    public DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        NamesUtils n  = new NamesUtils(getApplication());
        wikiframe = (TextView) findViewById(R.id.wikiframe);


        daoSession = ((TBApplication)getApplication()).getDaoSession();
        try{

            // autocompletetextview is in activity_main.xml
            myAutoComplete = (CustomAutoCompleteView) findViewById(R.id.myautocomplete);

            // add the listener so it will tries to suggest while the user types
            myAutoComplete.addTextChangedListener(new CustomAutoCompleteTextChangedListener(this));

            // set our adapter
            myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, item);
            myAutoComplete.setAdapter(myAdapter);

            myAutoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    myAutoComplete.performCompletion();
                    cur = myAutoComplete.getText().toString();
                    //TODO open up artist page
                    openTours();


                }


            });

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // this function is used in CustomAutoCompleteTextChangedListener.java
    public String[] getItemsFromDb(String searchTerm) throws Exception{

        QueryBuilder qb = daoSession.getArtistDao().queryBuilder();
        qb.where(ArtistDao.Properties.Name.like("%"+searchTerm+"%"));
        if(daoSession.getArtistDao().loadAll().size()!=0)
        return getArtistNames(qb.list());
        else
            return new String[0];
    }

    public String[] getArtistNames(List<Artist>artists){
        String[] as = new String[artists.size()];
        int cur = 0;
        for (Artist a:artists){
            as[cur] = a.getName();
            cur++;
        }
        return as;
    }

    public void openTours(){
        Intent intent = new Intent(this,Dashboard.class);
        intent.putExtra("artist",myAutoComplete.getText().toString());
        startActivity(intent);
    }
}
