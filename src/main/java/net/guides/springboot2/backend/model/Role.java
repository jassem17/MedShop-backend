package net.guides.springboot2.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {

    /** The id. */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role",unique = true,nullable = false)
    private Integer id_role;

    /** The name. */
    @Column(name = "nom", nullable = false)
    private String nom;


   /* @OneToMany(mappedBy = "role")
    private List<User> users;
    */public Role(){
    }

    public Role(Integer id_role, String nom){
        this.id_role = id_role;
        this.nom=nom;
    }

    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Role [id=" + id_role + ", nom=" + nom + "]";
}}
