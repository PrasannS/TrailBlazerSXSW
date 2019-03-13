package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Buzzangle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("artist")
    @Expose
    private Artist artist;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}