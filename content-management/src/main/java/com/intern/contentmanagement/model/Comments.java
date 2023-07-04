package com.intern.contentmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Objects;
@Data
@Entity
public class Comments {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "parent_id", nullable = true)
    private Integer parentId;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "content_id", nullable = true)
    private Integer contentId;
    @Basic
    @Column(name = "images", nullable = true, length = -1)
    private String images;
    @Basic
    @Column(name = "is_deleted", nullable = true)
    private Byte isDeleted;
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
        Comments comments = (Comments) o;
        return Objects.equals(id, comments.id) && Objects.equals(parentId, comments.parentId) && Objects.equals(userId, comments.userId) && Objects.equals(description, comments.description) && Objects.equals(contentId, comments.contentId) && Objects.equals(images, comments.images) && Objects.equals(isDeleted, comments.isDeleted) && Objects.equals(createdAt, comments.createdAt) && Objects.equals(updatedAt, comments.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, userId, description, contentId, images, isDeleted, createdAt, updatedAt);
    }
}
