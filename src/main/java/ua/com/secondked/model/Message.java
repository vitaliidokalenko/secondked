package ua.com.secondked.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "messages")
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "createdDateTime"})
@ToString(of = {"id", "createdDateTime"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private User sender;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private User recipient;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private ZonedDateTime createdDateTime;
}
