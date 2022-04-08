package net.guides.springboot2.backend.model;


import java.util.List;

import javax.persistence.*;


@Entity
@Table (name = "product_category")
public class Category {

    /** The id. */

    private Integer id;

    /** The name. */
    private String nom;

    /** The products. */
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    /**
     * Empty Constructor. Instantiates a new category.
     */
    public Category() {
    }


    public Category(Integer id, String nom) {
        this.id = id;
        this.nom = nom;

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name = "nom", nullable = false)

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Category [id=" + id +
                         ", nom=" + nom +
                        "]";
    }


}
