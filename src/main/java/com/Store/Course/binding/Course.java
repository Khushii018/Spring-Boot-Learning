package com.Store.Course.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Course_Details")
public class Course {
    @Id
    @Column(name="courseId")
    private int courseId;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private Double price;
}
