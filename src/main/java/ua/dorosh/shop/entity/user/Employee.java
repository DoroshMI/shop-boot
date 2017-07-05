package ua.dorosh.shop.entity.user;

import ua.dorosh.shop.entity.user.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by User on 29.05.2017.
 */
@Entity
@DiscriminatorValue(value = "E")
public class Employee extends User implements Serializable {

    private String title;

    public Employee() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
