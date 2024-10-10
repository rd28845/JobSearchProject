package com.JobSearchProject.JobSearch.input;

public class OrganizationInput {
    private String name;
    private String website;
    private Double lastFundingAmount;
    private Boolean activelyHiring;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Double getLastFundingAmount() {
        return lastFundingAmount;
    }

    public void setLastFundingAmount(Double lastFundingAmount) {
        this.lastFundingAmount = lastFundingAmount;
    }

    public Boolean getActivelyHiring() {
        return activelyHiring;
    }

    public void setActivelyHiring(Boolean activelyHiring) {
        this.activelyHiring = activelyHiring;
    }
}
