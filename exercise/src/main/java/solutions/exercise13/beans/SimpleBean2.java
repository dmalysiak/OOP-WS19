package solutions.exercise13.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class SimpleBean2 {
    @NonNull
    private String name;

    @Autowired
    @Qualifier("objectBeanSingleton")
    private Object objectBeanSingleton;
}
