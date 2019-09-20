package com.uyar.issuemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity implements Serializable {

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedAt;

    @Column(name = "created_by", length = 100)
    private String CreatedBy;

    @Column(name = "updated_at")
    private Date UpdatedAt;
    @Column(name = "updated_by", length = 100)
    private String UpdatedBy;

    @Column(name = "status")
    private Boolean Status;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;

}
