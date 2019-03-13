package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Buzzangle;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("params")
    @Expose
    private Params params;
    @SerializedName("method")
    @Expose
    private String method;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}