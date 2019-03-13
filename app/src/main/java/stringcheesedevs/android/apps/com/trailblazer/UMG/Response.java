package stringcheesedevs.android.apps.com.trailblazer.UMG;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("-xmlns:xsd")
    @Expose
    private String xmlnsXsd;
    @SerializedName("-xmlns:xsi")
    @Expose
    private String xmlnsXsi;
    @SerializedName("-status")
    @Expose
    private String status;
    @SerializedName("-version")
    @Expose
    private String version;
    @SerializedName("-xsi:noNamespaceSchemaLocation")
    @Expose
    private String xsiNoNamespaceSchemaLocation;
    @SerializedName("parsererror")
    @Expose
    private Parsererror parsererror;
    @SerializedName("artists")
    @Expose
    private Artists artists;

    public String getXmlnsXsd() {
        return xmlnsXsd;
    }

    public void setXmlnsXsd(String xmlnsXsd) {
        this.xmlnsXsd = xmlnsXsd;
    }

    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getXsiNoNamespaceSchemaLocation() {
        return xsiNoNamespaceSchemaLocation;
    }

    public void setXsiNoNamespaceSchemaLocation(String xsiNoNamespaceSchemaLocation) {
        this.xsiNoNamespaceSchemaLocation = xsiNoNamespaceSchemaLocation;
    }

    public Parsererror getParsererror() {
        return parsererror;
    }

    public void setParsererror(Parsererror parsererror) {
        this.parsererror = parsererror;
    }

    public Artists getArtists() {
        return artists;
    }

    public void setArtists(Artists artists) {
        this.artists = artists;
    }

}