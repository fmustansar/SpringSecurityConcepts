package fm.spring.security.concepts.SpringSecurityConcepts.example1.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Student {
    private final Integer studentId;
    private final String studentName;
}
