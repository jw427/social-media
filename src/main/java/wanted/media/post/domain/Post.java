package wanted.media.post.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import wanted.media.user.domain.User;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "posts")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @Column(name = "post_id", nullable = false)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    @Size(max = 150)
    @Column(nullable = false)
    private String title;
    private String content;
    private String hashtags;

    @ColumnDefault("0")
    private Long likeCount;

    @ColumnDefault("0")
    private Long viewCount;

    @ColumnDefault("0")
    private Long shareCount;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public void addShareCount() {
        this.shareCount++;
    }
}
