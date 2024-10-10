package com.JobSearchProject.JobSearch.repository;

import com.JobSearchProject.JobSearch.model.JobDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDocumentRepository extends JpaRepository<JobDocument, Long> {
}