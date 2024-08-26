package wanted.media.post.dto;

public record StatResponse(Long count) {

    public static StatResponse from(Long count) {
        return new StatResponse(count);
    }
}
