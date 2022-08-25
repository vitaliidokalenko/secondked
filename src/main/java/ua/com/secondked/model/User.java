package ua.com.secondked.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "name", "surname", "email"})
@ToString(of = {"id", "name", "surname", "email"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate registryDate;
    private String description;
    @Enumerated(EnumType.STRING)
    private Role role;
    private Double rating;
}
