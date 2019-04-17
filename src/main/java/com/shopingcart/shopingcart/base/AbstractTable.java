/*
package com.shopingcart.shopingcart.base;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class AbstractTable {

    @CreatedDate
    @Column(name = "create_date",nullable = false)
    private LocalDateTime createDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

}
*/
