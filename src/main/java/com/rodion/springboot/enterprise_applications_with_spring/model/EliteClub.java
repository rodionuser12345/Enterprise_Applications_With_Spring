package com.rodion.springboot.enterprise_applications_with_spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elite_club")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@NamedQueries({@NamedQuery(name = "EliteClub.findClubs",
//        query = "SELECT x " +
//                "from com.rodion.springboot.enterprise_applications_with_spring.model.EliteClub x " +
//                "WHERE x.clubName " +
//                "LIKE :serachTerm ")})
public class EliteClub implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "club_name")
    private String clubName;
}