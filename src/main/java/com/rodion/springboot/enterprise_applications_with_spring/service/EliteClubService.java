package com.rodion.springboot.enterprise_applications_with_spring.service;

import com.rodion.springboot.enterprise_applications_with_spring.dto.ClubDTO;

import java.util.List;

public interface EliteClubService {

    List<ClubDTO> getAll();

    List<ClubDTO> searchClub(String searchTerm);

    void addClub(String... clubNames);

    ClubDTO getByID(long clubId);

    void deleteClub(long clubId);

    ClubDTO updateClub(long clubId, ClubDTO updatedClub);
}

