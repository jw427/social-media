package wanted.media.post.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wanted.media.post.dto.StatParam;
import wanted.media.post.dto.StatResponse;
import wanted.media.post.service.StatService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StatController {
    private final StatService statService;

    @GetMapping("/statistics")
    public ResponseEntity<StatResponse> statistics(@ModelAttribute StatParam param) {
        StatResponse response = StatResponse.from(statService.statistics(param));
        return ResponseEntity.ok().body(response);
    }
}
