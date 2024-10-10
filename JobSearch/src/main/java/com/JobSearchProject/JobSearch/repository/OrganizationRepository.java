package com.JobSearchProject.JobSearch.repository;

import com.JobSearchProject.JobSearch.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    // Basic CRUD operations are automatically provided by JpaRepository

    // Find all organizations that are actively hiring
    List<Organization> findByActivelyHiringTrue();

    // Find organizations by industry (case-insensitive)
    @Query("SELECT o FROM Organization o JOIN o.industries i WHERE LOWER(i) = LOWER(:industry)")
    List<Organization> findByIndustry(@Param("industry") String industry);

    // Find organizations that are actively hiring in a specific industry
    @Query("SELECT o FROM Organization o JOIN o.industries i WHERE o.activelyHiring = true AND LOWER(i) = LOWER(:industry)")
    List<Organization> findByActivelyHiringTrueAndIndustry(@Param("industry") String industry);

    // Find organizations by multiple industries
    @Query("SELECT DISTINCT o FROM Organization o JOIN o.industries i WHERE LOWER(i) IN :industries")
    List<Organization> findByIndustries(@Param("industries") List<String> industries);

    // Find organizations by name containing a specific string (case-insensitive)
    List<Organization> findByNameContainingIgnoreCase(String name);
}