package ua.com.secondked.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "areas")
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "name"})
@ToString(of = {"id", "name"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Area {

    @Id
    private String id;
    private String name;
    private String category;
    @ManyToOne
    private Region region;
}
