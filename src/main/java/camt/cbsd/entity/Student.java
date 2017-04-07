package camt.cbsd.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Dto on 3/11/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    long id;
    String studentId;
    String name;
    String surname;
    double gpa;
    String image;
    boolean feature;
    int penAmount;
    String description;
}
