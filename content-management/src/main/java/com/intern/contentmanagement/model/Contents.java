package com.intern.contentmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Objects;
@Data
@Entity
public class Contents {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "evaluation", nullable = false)
    private Byte evaluation;
    @Basic
    @Column(name = "categoty_id", nullable = false)
    private Integer categotyId;
    @Basic
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "is_deleted", nullable = false)
    private Byte isDeleted;
    @Basic
    @Column(name = "images", nullable = true, length = -1)
    private String images;
    @Basic
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contents contents = (Contents) o;
        return Objects.equals(id, contents.id) && Objects.equals(evaluation, contents.evaluation) && Objects.equals(categotyId, contents.categotyId) && Objects.equals(userId, contents.userId) && Objects.equals(description, contents.description) && Objects.equals(isDeleted, contents.isDeleted) && Objects.equals(images, contents.images) && Objects.equals(createdAt, contents.createdAt) && Objects.equals(updatedAt, contents.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, evaluation, categotyId, userId, description, isDeleted, images, createdAt, updatedAt);
    }
}
