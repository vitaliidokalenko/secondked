package ua.com.secondked.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "items")
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "name", "createdDateTime"})
@ToString(of = {"id", "name", "createdDateTime"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Brand brand;
    @Enumerated(EnumType.STRING)
    private Age age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer price;
    @ManyToMany
    @JoinTable(name = "items_sizes",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "size_id"))
    private Set<Size> sizes;
    private Integer length;
    @ManyToMany
    @JoinTable(name = "items_colors",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id"))
    private Set<Color> colors;
    private String description;
    @ManyToOne
    private User author;
    @ManyToOne
    private City city;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private ZonedDateTime createdDateTime;
    private boolean isActive;
}
