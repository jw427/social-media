package wanted.media.post.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wanted.media.post.dto.StatParam;
import wanted.media.post.repository.StatRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StatService {
    private final StatRepository statRepository;

    public Long statistics(StatParam param) {
        return statRepository.statistics(param);
    }
}
