package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Buzzangle;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("disp_date")
    @Expose
    private String dispDate;
    @SerializedName("album_project")
    @Expose
    private AlbumProject albumProject;
    @SerializedName("album_sales")
    @Expose
    private AlbumSales albumSales;
    @SerializedName("song_project")
    @Expose
    private SongProject songProject;
    @SerializedName("song_sales")
    @Expose
    private SongSales songSales;
    @SerializedName("song_streams")
    @Expose
    private SongStreams songStreams;
    @SerializedName("song_airplay")
    @Expose
    private SongAirplay songAirplay;
    @SerializedName("song_shazams")
    @Expose
    private SongShazams songShazams;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDispDate() {
        return dispDate;
    }

    public void setDispDate(String dispDate) {
        this.dispDate = dispDate;
    }

    public AlbumProject getAlbumProject() {
        return albumProject;
    }

    public void setAlbumProject(AlbumProject albumProject) {
        this.albumProject = albumProject;
    }

    public AlbumSales getAlbumSales() {
        return albumSales;
    }

    public void setAlbumSales(AlbumSales albumSales) {
        this.albumSales = albumSales;
    }

    public SongProject getSongProject() {
        return songProject;
    }

    public void setSongProject(SongProject songProject) {
        this.songProject = songProject;
    }

    public SongSales getSongSales() {
        return songSales;
    }

    public void setSongSales(SongSales songSales) {
        this.songSales = songSales;
    }

    public SongStreams getSongStreams() {
        return songStreams;
    }

    public void setSongStreams(SongStreams songStreams) {
        this.songStreams = songStreams;
    }

    public SongAirplay getSongAirplay() {
        return songAirplay;
    }

    public void setSongAirplay(SongAirplay songAirplay) {
        this.songAirplay = songAirplay;
    }

    public SongShazams getSongShazams() {
        return songShazams;
    }

    public void setSongShazams(SongShazams songShazams) {
        this.songShazams = songShazams;
    }

}