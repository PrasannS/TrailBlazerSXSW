package stringcheesedevs.android.apps.com.trailblazer.UMG;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Div {

    @SerializedName("-style")
    @Expose
    private String style;
    @SerializedName("#text")
    @Expose
    private String text;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
