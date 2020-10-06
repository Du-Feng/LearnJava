package com.example.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComplexEmployee {
    private Integer employeeId;
    private String name;
    private String company;
    private String email;
}
