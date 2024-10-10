package com.JobSearchProject.JobSearch.resolver;

import com.JobSearchProject.JobSearch.model.JobDocument;
import com.JobSearchProject.JobSearch.repository.CompanyRatingRepository;
import com.JobSearchProject.JobSearch.entity.CompanyRating;
import com.JobSearchProject.JobSearch.input.CompanyRatingInput;
import com.JobSearchProject.JobSearch.input.JobDocumentInput;
import com.JobSearchProject.JobSearch.service.JobDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Component
public class MutationResolver {

    @Autowired
    private JobDocumentService jobDocumentService;

    @MutationMapping
    public JobDocument addJobDocument(@Argument JobDocumentInput input) {
        return jobDocumentService.addJobDocument(
            Long.parseLong(input.getOrganizationId()),
            input.getTitle(),
            input.getDocumentUrl(),
            input.getDocumentType()
        );
    }

    @Autowired
    private CompanyRatingRepository companyRatingRepository;

    public CompanyRating submitCompanyRating(CompanyRatingInput input) {
        CompanyRating rating = new CompanyRating();
        rating.setCompanyId(input.getCompanyId());
        rating.setUserId(input.getUserId());
        rating.setRating(input.getRating());
        rating.setComments(input.getComments());

        return companyRatingRepository.save(rating);
    }
}