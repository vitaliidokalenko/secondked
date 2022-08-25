package ua.com.secondked.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "name"})
@ToString(of = {"id", "name"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Region {

    @Id
    private String id;
    private String name;
    private String category;
}
