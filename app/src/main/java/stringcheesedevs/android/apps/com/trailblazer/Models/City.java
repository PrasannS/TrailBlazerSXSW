package stringcheesedevs.android.apps.com.trailblazer.Models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "city")
public class City {
    @Property(nameInDb = "picurl")
    String picURL;
    @Property(nameInDb = "description")
    String description;
    @Property(nameInDb = "name")
    String name;
    @Property(nameInDb = "tourcode")
    String tourCode;
    @Property(nameInDb = "latitude")
    double latitude;
    @Property(nameInDb = "longitude")
    double longitude;
    @Property(nameInDb = "position")
    int pos;
    @Id(autoincrement = true)
    Long id;

    public City(String picURL, String description, String name, String tourCode, double latitude, double longitude) {
        this.picURL = picURL;
        this.description = description;
        this.name = name;
        this.tourCode = tourCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Generated(hash = 550284154)
    public City(String picURL, String description, String name, String tourCode, double latitude, double longitude, int pos,
            Long id) {
        this.picURL = picURL;
        this.description = description;
        this.name = name;
        this.tourCode = tourCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pos = pos;
        this.id = id;
    }

    @Generated(hash = 750791287)
    public City() {
    }

    public String getpicURL() {
        return picURL;
    }

    public void setpicURL(String picURL) {
        this.picURL = picURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPicURL() {
        return this.picURL;
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

    public int getPos() {
        return this.pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
