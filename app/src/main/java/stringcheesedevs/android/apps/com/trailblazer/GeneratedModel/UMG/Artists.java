package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.UMG;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artists {

    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("pageSize")
    @Expose
    private String pageSize;
    @SerializedName("totalItems")
    @Expose
    private String totalItems;
    @SerializedName("artist")
    @Expose
    private List<Artist> artist = null;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public List<Artist> getArtist() {
        return artist;
    }

    public void setArtist(List<Artist> artist) {
        this.artist = artist;
    }

}