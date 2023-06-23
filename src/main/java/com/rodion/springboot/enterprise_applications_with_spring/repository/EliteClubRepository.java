package com.rodion.springboot.enterprise_applications_with_spring.repository;

import com.rodion.springboot.enterprise_applications_with_spring.model.EliteClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EliteClubRepository extends JpaRepository<EliteClub, Long> {

    @Query("SELECT x from EliteClub x WHERE lower(x.clubName) LIKE :searchTerm order by x.clubName asc")
    List<EliteClub> findClubs(@Param("searchTerm") String searchTerm);
}

