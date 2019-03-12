package stringcheesedevs.android.apps.com.trailblazer.Models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "comment")
public class Artist {
    @Property(nameInDb = "comment")
    String name;
    @Property(nameInDb = "comment")
    String picURL;
    @Id(autoincrement = true)
    Long id;



    @Generated(hash = 395643375)
    public Artist(String name, String picURL, Long id) {
        this.name = name;
        this.picURL = picURL;
        this.id = id;
    }

    @Generated(hash = 19829037)
    public Artist() {
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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
