package com.uyar.issuemanagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedAt;
    @Column(name = "created_by", length = 100)
    private String CreatedBy;
    private Date UpdatedAt;
    @Column(name = "updated_by", length = 100)
    private String UpdatedBy;
    @Column(name = "status")
    private Boolean Status;

}
