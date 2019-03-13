package stringcheesedevs.android.apps.com.trailblazer.Setlist;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Setlist {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("itemsPerPage")
    @Expose
    private int itemsPerPage;
    @SerializedName("page")
    @Expose
    private int page;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("setlist")
    @Expose
    private List<Setlist_> setlist = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Setlist_> getSetlist() {
        return setlist;
    }

    public void setSetlist(List<Setlist_> setlist) {
        this.setlist = setlist;
    }

}