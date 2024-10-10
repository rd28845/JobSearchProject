package com.JobSearchProject.JobSearch.resolver;

import com.JobSearchProject.JobSearch.model.JobDocument;
import com.JobSearchProject.JobSearch.input.JobDocumentInput;
import com.JobSearchProject.JobSearch.service.JobDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
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
}