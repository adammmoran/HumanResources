package yrk.com.ua.human_resources.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "position")
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String secondName;
    private String number;
    @ManyToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.DETACH
    )
    private Position position;
    @ManyToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.DETACH
    )
    private Project project;
}
