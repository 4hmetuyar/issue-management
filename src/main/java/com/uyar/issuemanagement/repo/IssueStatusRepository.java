package com.uyar.issuemanagement.repo;

import com.uyar.issuemanagement.entity.IssueStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueStatusRepository extends JpaRepository<IssueStatus, Long> {
}
