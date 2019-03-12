package stringcheesedevs.android.apps.com.trailblazer.Models;

public class Artist {
    int id;
    String name;
    String picURL;

    public Artist(int id, String name, String picURL) {
        this.id = id;
        this.name = name;
        this.picURL = picURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }
}
