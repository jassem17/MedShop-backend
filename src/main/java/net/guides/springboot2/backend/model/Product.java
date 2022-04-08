package net.guides.springboot2.backend.model;



import javax.persistence.*;


@Entity
@Table (name = "product")
public class Product {

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    /** The name. */
    @Column(name = "nom", nullable = false)
    private String nom;

    /** The description. */
    @Column(name = "description")
    private String description;



    /** The price . */
    @Column(name = "prix", nullable = false)
    private double prix;


    /** quantite **/
    @Column(name="quantite")
    private Integer quantite;

    /** The image url. */
    @Column(name = "imageurl")
    private String imageUrl;

    /** The image shadow. */
    @Column(name = "imageshadow")
    private String imageShadow;



    /** The category. */
    @ManyToOne
    @JoinColumn(name ="category_id")
    private Category category;

    /**
     * Empty Constructor. Instantiates a new product.
     */
    public Product() {
    }


    public Product(Integer id, String nom, String description, double prix, Integer quantite,String imageUrl,
                   String imageShadow) {

        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.imageUrl = imageUrl;
        this.imageShadow = imageShadow;

    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getImageUrl() {
        return imageUrl;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getImageShadow() {
        return imageShadow;
    }


    public void setImageShadow(String imageShadow) {
        this.imageShadow = imageShadow;
    }



    public double getPrix() {
        return prix;
    }


    public void setPrix(double prix) {
        this.prix = prix;
    }

    public  Integer getQuantite(){
        return quantite;
    }
    public void setQuantite( Integer quantite){
        this.quantite=quantite;
    }


    @Override
    public String toString() {
        return "Product [id=" + id + ", nom=" + nom + ", prix=" + prix + ", quantite" + quantite + ", imageurl" + imageUrl+ ", imageshadow" + imageShadow + ", description" + description + "]";
    }


}
