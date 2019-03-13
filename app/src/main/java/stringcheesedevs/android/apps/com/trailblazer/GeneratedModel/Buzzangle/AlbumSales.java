package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Buzzangle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlbumSales {

    @SerializedName("total")
    @Expose
    private Total total;
    @SerializedName("album_physical")
    @Expose
    private AlbumPhysical albumPhysical;
    @SerializedName("album_digital")
    @Expose
    private AlbumDigital albumDigital;

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public AlbumPhysical getAlbumPhysical() {
        return albumPhysical;
    }

    public void setAlbumPhysical(AlbumPhysical albumPhysical) {
        this.albumPhysical = albumPhysical;
    }

    public AlbumDigital getAlbumDigital() {
        return albumDigital;
    }

    public void setAlbumDigital(AlbumDigital albumDigital) {
        this.albumDigital = albumDigital;
    }

}