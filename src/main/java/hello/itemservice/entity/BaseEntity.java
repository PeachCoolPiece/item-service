package hello.itemservice.entity;


import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    
    @CreatedDate
    @Comment("생성 일시")
    private LocalDateTime createAt;
    
    @LastModifiedDate
    @Comment("수정 일시")
    private LocalDateTime updatedDate;
}
