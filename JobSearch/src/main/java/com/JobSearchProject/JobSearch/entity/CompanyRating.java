package com.JobSearchProject.JobSearch.entity;

import jakarta.persistence.*;
import java.util.Objects;
// import graphql.com.google.common.base.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "company_ratings")
public class CompanyRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Integer rating;

    @Column(columnDefinition = "TEXT")
    private String comments;

    // Default constructor
    public CompanyRating() {}

    // Constructor with fields
    public CompanyRating(Long companyId, Long userId, Integer rating, String comments) {
        this.companyId = companyId;
        this.userId = userId;
        this.rating = rating;
        this.comments = comments;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

   // ... existing code ...

@Override
public String toString() {
    return "CompanyRating{" +
            "id=" + id +
            ", companyId=" + companyId +
            ", userId=" + userId +
            ", rating=" + rating +
            ", comments='" + comments + '\'' +
            '}';
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyRating that = (CompanyRating) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(companyId, that.companyId) &&
            Objects.equals(userId, that.userId) &&
            Objects.equals(rating, that.rating) &&
            Objects.equals(comments, that.comments);
}

@Override
public int hashCode() {
    return Objects.hash(id, companyId, userId, rating, comments);
}

// ... rest of the class
}