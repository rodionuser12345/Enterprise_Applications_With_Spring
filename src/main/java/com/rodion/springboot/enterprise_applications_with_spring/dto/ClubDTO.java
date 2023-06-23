package com.rodion.springboot.enterprise_applications_with_spring.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClubDTO implements Serializable {
    private final String clubName;

    public ClubDTO(String clubName) {
        this.clubName = clubName;
    }

}
