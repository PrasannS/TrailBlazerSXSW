package stringcheesedevs.android.apps.com.trailblazer.Setlist;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Set {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("encore")
    @Expose
    private int encore;
    @SerializedName("song")
    @Expose
    private List<Song> song = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEncore() {
        return encore;
    }

    public void setEncore(int encore) {
        this.encore = encore;
    }

    public List<Song> getSong() {
        return song;
    }

    public void setSong(List<Song> song) {
        this.song = song;
    }

}
