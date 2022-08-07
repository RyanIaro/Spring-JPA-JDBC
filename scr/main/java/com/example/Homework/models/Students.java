package com.example.Homework.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id_student;

    @Column(nullable = false, length = 100)
    private String student_name;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "id_group")
    private Long group;
}
