package com.JobSearchProject.JobSearch.input;

public class CompanyRatingInput {
    private Long companyId;
    private Long userId;
    private Integer rating;
    private String comments;

    public Long getCompanyId() {
        return companyId;
    }

    public Long getUserId() {
        return userId;
    }

    public Integer getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    // Setters
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}