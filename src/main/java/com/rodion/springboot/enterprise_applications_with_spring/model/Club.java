package com.rodion.springboot.enterprise_applications_with_spring.model;


public class Club {
    private final String clubName;

    public Club(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }
}
