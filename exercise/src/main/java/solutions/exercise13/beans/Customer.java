package solutions.exercise13.beans;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Customer {
    @NonNull
    String name;
    @NonNull
    String address;
}
