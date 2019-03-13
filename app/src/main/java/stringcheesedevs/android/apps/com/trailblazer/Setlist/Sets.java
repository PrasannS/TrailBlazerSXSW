package stringcheesedevs.android.apps.com.trailblazer.Setlist;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sets {

    @SerializedName("set")
    @Expose
    private List<Set> set = null;

    public List<Set> getSet() {
        return set;
    }

    public void setSet(List<Set> set) {
        this.set = set;
    }

}
