package ua.dorosh.shop.entity;

import ua.dorosh.shop.entity.user.Bidder;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by n.dorosh on 05.07.2017.
 */
@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate bidDate;

    private Float price;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Bidder bidder;



}
