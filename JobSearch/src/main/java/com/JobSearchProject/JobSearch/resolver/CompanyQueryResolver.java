package com.JobSearchProject.JobSearch.resolver;

import com.JobSearchProject.JobSearch.entity.CompanyRating;
import com.JobSearchProject.JobSearch.repository.CompanyRatingRepository;
// import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyQueryResolver {

    @Autowired
    private CompanyRatingRepository companyRatingRepository;

    public Double getCompanyAverageRating(Long companyId) {
        return companyRatingRepository.getAverageRatingByCompanyId(companyId);
    }

    public List<CompanyRating> getCompanyReviews(Long companyId) {
        return companyRatingRepository.findByCompanyId(companyId);
    }
}