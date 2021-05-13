package SocratesPizza.Project;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AddressInfo implements Serializable {
    @Id
    private String email;

    private String streetAddress;
    private int zipCode;
    private String cityName;
    private String stateName;

    @OneToOne
    @MapsId
    @JoinColumn(name = "email")
    private UserInfo user;

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
