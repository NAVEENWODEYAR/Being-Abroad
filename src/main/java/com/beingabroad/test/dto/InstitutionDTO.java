package com.beingabroad.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstitutionDTO {
    private String name;
    private String location;
    private String contactNo;
    private String address;
}
