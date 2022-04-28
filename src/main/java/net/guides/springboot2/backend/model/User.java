package net.guides.springboot2.backend.model;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "account")

public class User {

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable = false)
    private Integer id;

    /** The name. */
    @Column(name = "nom")
    private String nom;

    /** The username. */
    @Column(name = "username")
    private String username;

    /** The email. */
    @Column(name = "email")
    private String email;

    /** The password. */
    @Column(name = "password")
    private String password;

    /** The ville. */
    @Column(name = "ville")
    private String ville;

    /** The code postal. */
    @Column(name = "code postal")
    private Integer codePostal;

    /** The telephone. */
    @Column(name = "telephone")
    private String telephone;


    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="id") ,
            inverseJoinColumns = @JoinColumn(name="id_role"))
    private List<Role> roles;

    /*@ManyToOne
    @JoinColumn(name ="role_id")
    private Role role;*/

    public User() { }

    public User(Integer id,String nom , String username, String email, String password , String ville , Integer codePostal
    ,String telephone){
        this.id=id;
        this.nom=nom;
        this.username=username;
        this.email=email;
        this.password=password;
        this.ville=ville;
        this.codePostal=codePostal;
        this.telephone=telephone;
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


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }


    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Role> getRoles(){
        return roles;
    }

    public void setRoles(List<Role> roles){
        this.roles=roles;
    }



    @Override
    public String toString() {
        return "User [id=" + id + ", nom=" + nom + ", username=" + username + "]";
    }



}
