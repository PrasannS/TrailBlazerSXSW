package stringcheesedevs.android.apps.com.trailblazer.Models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "tour")
public class Tour {
    @Property(nameInDb = "code")
    String code;
    @Property(nameInDb = "name")
    String name;
    @Property(nameInDb = "website")
    String website;
    @Id(autoincrement = true)
    Long id;

    public Tour(String code, String name, String website) {
        this.code = code;
        this.name = name;
        this.website = website;
    }

    @Generated(hash = 592402865)
    public Tour(String code, String name, String website, Long id) {
        this.code = code;
        this.name = name;
        this.website = website;
        this.id = id;
    }

    @Generated(hash = 419901603)
    public Tour() {
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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}