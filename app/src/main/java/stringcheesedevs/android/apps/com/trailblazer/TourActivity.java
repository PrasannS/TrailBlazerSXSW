package stringcheesedevs.android.apps.com.trailblazer;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.Arrays;
import java.util.List;

import stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Setlist.City;
import stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Setlist.Tour;
import stringcheesedevs.android.apps.com.trailblazer.Models.CityDao;
import stringcheesedevs.android.apps.com.trailblazer.Models.DaoSession;

public class TourActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        daoSession = ((TBApplication)getApplication()).getDaoSession();
        setContentView(R.layout.activity_tour);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    public void plotTour(GoogleMap googleMap, stringcheesedevs.android.apps.com.trailblazer.Models.Tour t){
        QueryBuilder<stringcheesedevs.android.apps.com.trailblazer.Models.City> qb = daoSession.getCityDao().queryBuilder();
        qb.where(CityDao.Properties.TourCode.eq(t.getCode()));
        qb.orderAsc(CityDao.Properties.Pos);
        List<stringcheesedevs.android.apps.com.trailblazer.Models.City> cities = qb.list();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        LatLng prev = null;
        for(stringcheesedevs.android.apps.com.trailblazer.Models.City c:cities){
            LatLng p = new LatLng(c.getLatitude(),c.getLongitude());
            googleMap.addMarker(new MarkerOptions().position(p).title(c.getDescription()));
            builder.include(p);
            if(prev!=null){
                googleMap.addPolyline(new PolylineOptions()
                        .add(p, prev)
                        .width(3)
                        .color(Color.BLACK));
            }
            prev = p;
        }

        LatLngBounds bounds = builder.build();
        int padding = 45; // offset from edges of the map in pixels
        CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, padding);
        googleMap.animateCamera(cu);
    }
}
