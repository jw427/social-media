package wanted.media.user.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "codes")
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long codeId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Size(max = 10)
    @Column(nullable = false)
    private String authCode;

    @CreatedDate
    private LocalDateTime createdTime;
}