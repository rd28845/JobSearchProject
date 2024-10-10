package com.JobSearchProject.JobSearch.service;

import com.JobSearchProject.JobSearch.model.Organization;
import com.JobSearchProject.JobSearch.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public Optional<Organization> getOrganizationById(Long id) {
        return organizationRepository.findById(id);
    }

    public Organization createOrganization(Organization organization) {
        // Organization organization = new Organization();
        organization.setName(organization.getName());
        organization.setWebsite(organization.getWebsite());
        organization.setLastFundingAmount(organization.getLastFundingAmount());
        organization.setActivelyHiring(organization.getActivelyHiring());

        return organizationRepository.save(organization);


    }

    public Organization updateOrganization(Long id, Organization organizationDetails) {
        Organization organization = organizationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Organization not found"));

        // Update fields
        organization.setName(organizationDetails.getName());
        organization.setNameUrl(organizationDetails.getNameUrl());
        organization.setDescription(organizationDetails.getDescription());
        organization.setLastFundingAmount(organizationDetails.getLastFundingAmount());
        organization.setActivelyHiring(organizationDetails.getActivelyHiring());
        organization.setOperatingStatus(organizationDetails.getOperatingStatus());
        organization.setCompanyType(organizationDetails.getCompanyType());
        organization.setHeadquartersLocation(organizationDetails.getHeadquartersLocation());
        organization.setIpoStatus(organizationDetails.getIpoStatus());
        organization.setContactJobDepartments(organizationDetails.getContactJobDepartments());
        organization.setLastFundingType(organizationDetails.getLastFundingType());
        organization.setGrowthCategory(organizationDetails.getGrowthCategory());
        organization.setIndustries(organizationDetails.getIndustries());
        organization.setFounders(organizationDetails.getFounders());
        organization.setContactEmail(organizationDetails.getContactEmail());

        return organizationRepository.save(organization);
    }
    public List<Organization> getActivelyHiringOrganizationsFiltered(
            List<String> industries, String location, Integer minEmployees) {
        List<Organization> organizations = organizationRepository.findByActivelyHiringTrue();

        return organizations.stream()
                .filter(org -> industries == null || industries.isEmpty() || 
                               org.getIndustries().stream().anyMatch(industries::contains))
                .filter(org -> location == null || 
                               org.getHeadquartersLocation().toLowerCase().contains(location.toLowerCase()))
                .filter(org -> minEmployees == null || 
                               (org.getEmployeeCount() != null && org.getEmployeeCount() >= minEmployees))
                .collect(Collectors.toList());
    }

    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}