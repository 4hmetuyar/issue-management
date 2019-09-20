package com.uyar.issuemanagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
public class Issue extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description", length = 400)
    private String description;
    @Column(name = "date")
    private Date date;
    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;
}
