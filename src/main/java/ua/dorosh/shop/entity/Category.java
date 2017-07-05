package ua.dorosh.shop.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 29.05.2017.
 */

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate created;


    @ManyToMany
    @JoinTable(name = "category_item", joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Item> items;

    @ManyToOne
    private Category parentCategory;

    @OneToMany
    private Set<Category> subCategories = new HashSet<>();


    /**
     * Keywords associated with this category
     */
    @ElementCollection
    @CollectionTable(name = "keywords")
    private Set<String> keywords;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Item> getItems() {
        return items;
    }


    public void setItems(Set<Item> items) {
        this.items = items;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}
