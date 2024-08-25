package wanted.media.content.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import wanted.media.content.domain.Post;
import wanted.media.content.domain.Type;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostDto {
    private Long id;
    private Long likeCount;
    private Type type;
    private String title;
    private String content;
    private String hashtags;
    private Long viewCount;
    private Long shareCount;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private String account;

    public static PostDto allPosts(Post post) {
        return new PostDto(
                post.getId(),
                post.getLikeCount(),
                post.getType(),
                post.getTitle(),
                post.getContent(),
                post.getHashtags(),
                post.getViewCount(),
                post.getShareCount(),
                post.getUpdatedAt(),
                post.getCreatedAt(),
                post.getUser().getAccount()
        );
    }
}