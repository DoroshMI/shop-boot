package ua.dorosh.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by User on 31.05.2017.
 */
@Entity
public class Shipping {

    /**
     * Shipping cost
     */
    private BigDecimal cost;

    /**
     * Shipping id
     */
    private Long id;

    public Shipping() {
    }

    /**
     * Returns the shipping Id
     * @return shipping id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getShippingId() {
        return id;
    }

    /**
     * Sets the shipping id
     * @param id - shipping id
     */
    public void setShippingId(Long id) {
        this.id = id;
    }

    /**
     * Cost of the shipping
     * @param cost - cost
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * Returns the cost of the shipping
     * @return shipping cost
     */
    public BigDecimal getCost() {
        return cost;
    }

}
