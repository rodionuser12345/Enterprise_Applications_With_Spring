package com.rodion.springboot.enterprise_applications_with_spring.controller;


import com.rodion.springboot.enterprise_applications_with_spring.dto.ClubDTO;
import com.rodion.springboot.enterprise_applications_with_spring.service.EliteClubServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EliteClubController {
    private final EliteClubServiceImpl eliteClubService;

    public EliteClubController(EliteClubServiceImpl eliteClubService) {
        this.eliteClubService = eliteClubService;
    }

    @GetMapping(path = "/clubs", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClubDTO> clubs() {
        return eliteClubService.getAll();
    }

    @GetMapping(path = "/club/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClubDTO clubWithId(@PathVariable long id) {
        return eliteClubService.getByID(id);
    }

    @GetMapping(path = "/club/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClubDTO> searchClub(@RequestParam String clubName) {
        return eliteClubService.searchClub(clubName);
    }

    @PostMapping(path = "/club", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClubDTO> createNewClub(@RequestBody ClubDTO clubDTO) {
        eliteClubService.addClub(clubDTO.getClubName());
        return ResponseEntity.status(HttpStatus.CREATED).body(clubDTO);
    }

    @PutMapping(path = "/club/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClubDTO updateClub(@PathVariable long id, @RequestBody ClubDTO clubDTO) {
        return eliteClubService.updateClub(id, clubDTO);
    }

    @DeleteMapping(path = "/club/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteClub(@PathVariable long id) {
        eliteClubService.deleteClub(id);
    }
}
