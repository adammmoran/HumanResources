package yrk.com.ua.human_resources.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "positions")
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String departmentName;
    @Enumerated(EnumType.STRING)
    private City city;
    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "department"
    )
    private List<Position> positions;
    private String description;

    public void addPosition(Position position) {
        if (positions == null) {
            positions = new ArrayList<>();
            positions.add(position);
        } else {
            positions.add(position);
        }
    }
}
