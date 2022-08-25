package ua.com.secondked.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "images")
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "link"})
@ToString(of = {"id", "link"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String link;
    private boolean isMain;
    @ManyToOne
    private Item item;
}
