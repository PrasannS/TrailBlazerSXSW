package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Buzzangle;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Buzzangle {

    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}