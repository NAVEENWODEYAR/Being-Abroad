package com.beingabroad.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Institution_Table")
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stId;
    private String name;
    private String location;
    private String contactNo;
    private String address;
}
