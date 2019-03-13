//package stringcheesedevs.android.apps.com.trailblazer.APILoadServices;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class APILoader {
//
//    public static String buzzanglebase = "";
//    public static String umgbase = "";
//    public static String setlistbase = "";
//
//    private static Retrofit retrofit = null;
//    private final static String buzzanglekey = "";
//    private final static String umgkey = "";
//    private final static String setlistkey = "";
//
//    public static String[] loadAllArtists(){
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(buzzanglebase)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        BuzzAngleLoadI buzzAngleLoadI = retrofit.create(BuzzAngleLoadI.class);
//        Call<MovieResponse> call = movieApiService.getTopRatedMovies(API_KEY);
//        call.enqueue(new Callback<MovieResponse>() {
//            @Override
//            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
//                List<Movie> movies = response.body().getResults();
//            }
//            @Override
//            public void onFailure(Call<MovieResponse> call, Throwable throwable) {
//                Log.e(TAG, throwable.toString());
//            }
//        });
//    }
//
//    public static String[] loadArtistData(){
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(buzzanglebase)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        BuzzAngleLoadI buzzAngleLoadI = retrofit.create(BuzzAngleLoadI.class);
//        Call<MovieResponse> call = movieApiService.getTopRatedMovies(API_KEY);
//        call.enqueue(new Callback<MovieResponse>() {
//            @Override
//            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
//                List<Movie> movies = response.body().getResults();
//            }
//            @Override
//            public void onFailure(Call<MovieResponse> call, Throwable throwable) {
//                Log.e(TAG, throwable.toString());
//            }
//        });
//    }
//
//    public static String[] loadArtistTours(){
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(buzzanglebase)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        BuzzAngleLoadI buzzAngleLoadI = retrofit.create(BuzzAngleLoadI.class);
//        Call<MovieResponse> call = movieApiService.getTopRatedMovies(API_KEY);
//        call.enqueue(new Callback<MovieResponse>() {
//            @Override
//            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
//                List<Movie> movies = response.body().getResults();
//            }
//            @Override
//            public void onFailure(Call<MovieResponse> call, Throwable throwable) {
//                Log.e(TAG, throwable.toString());
//            }
//        });
//    }
//
//}
