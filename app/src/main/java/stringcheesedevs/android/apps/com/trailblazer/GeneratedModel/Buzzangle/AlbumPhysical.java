package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Buzzangle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlbumPhysical {

    @SerializedName("total")
    @Expose
    private Total_ total;
    @SerializedName("cd")
    @Expose
    private Cd cd;
    @SerializedName("vinyl")
    @Expose
    private Vinyl vinyl;
    @SerializedName("cassette")
    @Expose
    private Cassette cassette;

    public Total_ getTotal() {
        return total;
    }

    public void setTotal(Total_ total) {
        this.total = total;
    }

    public Cd getCd() {
        return cd;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
    }

    public Vinyl getVinyl() {
        return vinyl;
    }

    public void setVinyl(Vinyl vinyl) {
        this.vinyl = vinyl;
    }

    public Cassette getCassette() {
        return cassette;
    }

    public void setCassette(Cassette cassette) {
        this.cassette = cassette;
    }

}