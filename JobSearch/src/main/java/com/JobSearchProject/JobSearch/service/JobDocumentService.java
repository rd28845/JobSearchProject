package com.JobSearchProject.JobSearch.service;

import com.JobSearchProject.JobSearch.model.JobDocument;
import com.JobSearchProject.JobSearch.model.Organization;
import com.JobSearchProject.JobSearch.repository.JobDocumentRepository;
import com.JobSearchProject.JobSearch.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobDocumentService {

    @Autowired
    private JobDocumentRepository jobDocumentRepository;

    @Autowired
    private OrganizationRepository organizationRepository;

    public JobDocument addJobDocument(Long organizationId, String title, String documentUrl, String documentType) {
        Organization organization = organizationRepository.findById(organizationId)
            .orElseThrow(() -> new RuntimeException("Organization not found"));

        JobDocument jobDocument = new JobDocument();
        jobDocument.setOrganization(organization);
        jobDocument.setTitle(title);
        jobDocument.setDocumentUrl(documentUrl);
        jobDocument.setDocumentType(documentType);

        return jobDocumentRepository.save(jobDocument);
    }
}