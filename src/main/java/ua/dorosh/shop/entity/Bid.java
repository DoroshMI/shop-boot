package ua.dorosh.shop.entity;

import ua.dorosh.shop.entity.user.Bidder;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by User on 29.05.2017.
 */
@Entity
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate bidDate;

    private Float price;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Bidder bidder;

    public Bid() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBidDate() {
        return bidDate;
    }

    public void setBidDate(LocalDate bidDate) {
        this.bidDate = bidDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", bidDate=" + bidDate +
                ", price=" + price +
                '}';
    }
}
