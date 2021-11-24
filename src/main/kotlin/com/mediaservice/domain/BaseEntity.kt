package com.mediaservice.domain

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    var id: String? = null

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "DATE")
    var createTs: LocalDateTime? = null

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "DATE")
    var updatedTs: LocalDateTime = LocalDateTime.now()

}