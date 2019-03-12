package stringcheesedevs.android.apps.com.trailblazer.Models;

public class Tour {
    String code;
    String name;
    String website;

    public Tour(String code, String name, String website) {
        this.code = code;
        this.name = name;
        this.website = website;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
