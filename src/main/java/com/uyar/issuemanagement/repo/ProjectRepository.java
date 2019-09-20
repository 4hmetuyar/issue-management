package com.uyar.issuemanagement.repo;

import com.uyar.issuemanagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
