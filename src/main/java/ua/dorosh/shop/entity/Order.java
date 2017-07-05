package ua.dorosh.shop.entity;

import ua.dorosh.shop.entity.user.Bidder;

import javax.persistence.*;

/**
 * Created by User on 31.05.2017.
 */
@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Bidder bidder;



    public Order() {
    }
}
