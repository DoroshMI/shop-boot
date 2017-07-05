package ua.dorosh.shop.entity.user;

import ua.dorosh.shop.entity.Item;
import ua.dorosh.shop.entity.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by User on 29.05.2017.
 */

@Entity
@DiscriminatorValue(value = "S")
public class Seller extends User implements Serializable {

    private Float commissionRate;

    private int maxItemsAllowed;

    @OneToMany(mappedBy = "seller")
    private Set<Item> items;

    public Seller() {
    }



    public Float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getMaxItemsAllowed() {
        return maxItemsAllowed;
    }

    public void setMaxItemsAllowed(int maxItemsAllowed) {
        this.maxItemsAllowed = maxItemsAllowed;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
