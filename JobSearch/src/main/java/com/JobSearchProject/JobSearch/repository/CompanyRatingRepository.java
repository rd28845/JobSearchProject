package com.JobSearchProject.JobSearch.repository;

import com.JobSearchProject.JobSearch.entity.CompanyRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRatingRepository extends JpaRepository<CompanyRating, Long> {
    List<CompanyRating> findByCompanyId(Long companyId);
    
    @Query("SELECT AVG(cr.rating) FROM CompanyRating cr WHERE cr.companyId = :companyId")
    Double getAverageRatingByCompanyId(Long companyId);
}    