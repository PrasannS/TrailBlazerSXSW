package stringcheesedevs.android.apps.com.trailblazer.Setlist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist {

    @SerializedName("mbid")
    @Expose
    private String mbid;
    @SerializedName("tmid")
    @Expose
    private int tmid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sortName")
    @Expose
    private String sortName;
    @SerializedName("disambiguation")
    @Expose
    private String disambiguation;
    @SerializedName("url")
    @Expose
    private String url;

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public int getTmid() {
        return tmid;
    }

    public void setTmid(int tmid) {
        this.tmid = tmid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getDisambiguation() {
        return disambiguation;
    }

    public void setDisambiguation(String disambiguation) {
        this.disambiguation = disambiguation;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}