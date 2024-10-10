package com.JobSearchProject.JobSearch.resolver;

import com.JobSearchProject.JobSearch.model.Organization;
import com.JobSearchProject.JobSearch.service.OrganizationService;

// import com.JobSearchProject.JobSearch.input.OrganizationInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OrganizationResolver {



    @QueryMapping
    public List<Organization> activelyHiringOrganizations(
            @Argument List<String> industries,
            @Argument String location,
            @Argument Integer minEmployees) {
        return organizationService.getActivelyHiringOrganizationsFiltered(industries, location, minEmployees);
    }



    @Autowired
    private OrganizationService organizationService;

    @QueryMapping
    public Organization organization(@Argument Long id) {
        return organizationService.getOrganizationById(id)
                .orElseThrow(() -> new RuntimeException("Organization not found"));
    }

    @QueryMapping
    public List<Organization> allOrganizations() {
        return organizationService.getAllOrganizations();
    }

    @MutationMapping
    public Organization createOrganization(@Argument Organization input) {
        return organizationService.createOrganization(input);
    }

    @MutationMapping
    public Organization updateOrganization(@Argument Long id, @Argument Organization input) {
        return organizationService.updateOrganization(id, input);
    }

    @MutationMapping
    public boolean deleteOrganization(@Argument Long id) {
        organizationService.deleteOrganization(id);
        return true;
    }
}