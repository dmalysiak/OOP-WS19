package solutions.exercise13.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class SimpleBean{
    @NonNull
    private String name;
}
