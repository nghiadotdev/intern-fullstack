package com.intern.contentmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Objects;


@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Basic
    @Column(name = "last_name", nullable = true, length = 255)
    private String lastName;
    @Basic
    @Column(name = "first_name", nullable = true, length = 255)
    private String firstName;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "is_active", nullable = false)
    private Byte isActive;
    @Basic
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Basic
    @Column(name = "role", nullable = false, length = 255)
    private String role;
    @Basic
    @Column(name = "images", nullable = true, length = -1)
    private String images;
    @Basic
    @Column(name = "is_guest", nullable = true)
    private Byte isGuest;
    @Basic
    @Column(name = "last_login", nullable = true)
    private Timestamp lastLogin;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(lastName, users.lastName) && Objects.equals(firstName, users.firstName) && Objects.equals(description, users.description) && Objects.equals(isActive, users.isActive) && Objects.equals(email, users.email) && Objects.equals(role, users.role) && Objects.equals(images, users.images) && Objects.equals(isGuest, users.isGuest) && Objects.equals(lastLogin, users.lastLogin) && Objects.equals(createdAt, users.createdAt) && Objects.equals(updatedAt, users.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, description, isActive, email, role, images, isGuest, lastLogin, createdAt, updatedAt);
    }
}
