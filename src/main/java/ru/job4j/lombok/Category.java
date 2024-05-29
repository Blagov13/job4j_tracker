package ru.job4j.lombok;

import lombok.*;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Category {
    @NonNull
    @EqualsAndHashCode.Include
    private int id;
    @Setter
    private String name;
}
