package com.SpringDemo.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Length(max = 10,min =5) // w.r.t to hibernate
//    @Size(max = 10 ,min =3)

    private long departmentId;
    @NotBlank(message = "Please add department mapping")
    private String departmentName;
//    @Email
    private String departmentAddress;
//    @Positive
//    @PositiveOrZero
//    @Future // future date
//    @Past
//    @PastOrPresent
    private String departmentCode;


}
