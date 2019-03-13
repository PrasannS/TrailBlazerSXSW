package stringcheesedevs.android.apps.com.trailblazer.UMG;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parsererror {

    @SerializedName("-style")
    @Expose
    private String style;
    @SerializedName("h3")
    @Expose
    private List<String> h3 = null;
    @SerializedName("div")
    @Expose
    private Div div;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<String> getH3() {
        return h3;
    }

    public void setH3(List<String> h3) {
        this.h3 = h3;
    }

    public Div getDiv() {
        return div;
    }

    public void setDiv(Div div) {
        this.div = div;
    }

}
