package com.intern.contentmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Objects;
@Data
@Entity
public class Reacts {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "content_id", nullable = true)
    private Integer contentId;
    @Basic
    @Column(name = "r_like", nullable = true)
    private Integer rLike;
    @Basic
    @Column(name = "r_dislike", nullable = true)
    private Integer rDislike;
    @Basic
    @Column(name = "comment_id", nullable = true)
    private Integer commentId;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "update_at", nullable = true)
    private Timestamp updateAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reacts reacts = (Reacts) o;
        return Objects.equals(id, reacts.id) && Objects.equals(contentId, reacts.contentId) && Objects.equals(rLike, reacts.rLike) && Objects.equals(rDislike, reacts.rDislike) && Objects.equals(commentId, reacts.commentId) && Objects.equals(createdAt, reacts.createdAt) && Objects.equals(updateAt, reacts.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contentId, rLike, rDislike, commentId, createdAt, updateAt);
    }
}
