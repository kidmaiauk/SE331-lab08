package camt.cbsd.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dto on 3/11/2017.
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToMany
    List<Course> enrolledCourse;
    @NonNull long id;
    @NonNull String studentId;
    @NonNull String name;
    @NonNull String surname;
    @NonNull double gpa;
    @NonNull String image;
    @NonNull boolean feature;
    @NonNull int penAmount;
    @NonNull String description;
}
