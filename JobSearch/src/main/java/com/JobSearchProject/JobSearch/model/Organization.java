package com.JobSearchProject.JobSearch.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nameUrl;
    private String description;
    private Double lastFundingAmount;
    private Boolean activelyHiring;
    private String operatingStatus;
    private String companyType;
    private String headquartersLocation;
    private String ipoStatus;
    private String website; 
    private Integer employeeCount;
    @ElementCollection
    private List<String> contactJobDepartments;
    
    private String lastFundingType;
    private String growthCategory;
    
    @ElementCollection
    private List<String> industries;
    
    @ElementCollection
    private List<String> founders;
    
    private String contactEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameUrl() {
        return nameUrl;
    }

    public void setNameUrl(String nameUrl) {
        this.nameUrl = nameUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getHeadquartersLocation() {
        return headquartersLocation;
    }

    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    public String getIpoStatus() {
        return ipoStatus;
    }

    public void setIpoStatus(String ipoStatus) {
        this.ipoStatus = ipoStatus;
    }

    public List<String> getContactJobDepartments() {
        return contactJobDepartments;
    }

    public void setContactJobDepartments(List<String> contactJobDepartments) {
        this.contactJobDepartments = contactJobDepartments;
    }

    public String getLastFundingType() {
        return lastFundingType;
    }

    public void setLastFundingType(String lastFundingType) {
        this.lastFundingType = lastFundingType;
    }

    public String getGrowthCategory() {
        return growthCategory;
    }

    public void setGrowthCategory(String growthCategory) {
        this.growthCategory = growthCategory;
    }

    public List<String> getIndustries() {
        return industries;
    }

    public void setIndustries(List<String> industries) {
        this.industries = industries;
    }

    public List<String> getFounders() {
        return founders;
    }

    public void setFounders(List<String> founders) {
        this.founders = founders;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }
}