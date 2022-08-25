package ua.com.secondked.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "name"})
@ToString(of = {"id", "name"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    private String id;
    private String name;
    private String category;
    @ManyToOne
    private Community community;
}
