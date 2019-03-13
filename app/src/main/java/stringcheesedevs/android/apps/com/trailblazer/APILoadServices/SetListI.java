package stringcheesedevs.android.apps.com.trailblazer.APILoadServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Setlist.Setlist_;

public interface SetListI {

    @Headers("api_key: d0dc450-b5ca-4d12-9f1e-410e19057f50")
    @GET("1.0/artist/{mbid}/setlists")
    Call<List<Setlist_>> listPrevTours(@Path("mbid") String mbid, @Query("p") int page);
}
