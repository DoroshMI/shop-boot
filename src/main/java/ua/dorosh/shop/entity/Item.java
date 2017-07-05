package ua.dorosh.shop.entity;

import ua.dorosh.shop.entity.user.Seller;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

/**
 * Created by User on 29.05.2017.
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime startDate;

    private LocalDateTime createDate;

    private Float initialPrice;

    @OneToMany(mappedBy = "item")
    private List<Bid> bids;

    @ManyToOne
    private Seller seller;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "category_item", joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private Set<Category> categories;

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Float getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(Float initialPrice) {
        this.initialPrice = initialPrice;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", createDate=" + createDate +
                ", initialPrice=" + initialPrice +
                '}';
    }
}
