package com.uyar.issuemanagement.service;

import com.uyar.issuemanagement.dto.IssueDto;
import com.uyar.issuemanagement.entity.Issue;
import com.uyar.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto project);
}
