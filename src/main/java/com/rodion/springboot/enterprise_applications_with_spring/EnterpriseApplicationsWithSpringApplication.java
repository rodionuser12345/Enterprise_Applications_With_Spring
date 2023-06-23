package com.rodion.springboot.enterprise_applications_with_spring;

import com.rodion.springboot.enterprise_applications_with_spring.service.EliteClubServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnterpriseApplicationsWithSpringApplication implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(EliteClubServiceImpl.class);

    @Autowired
    private EliteClubServiceImpl eliteClubServiceImpl;

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseApplicationsWithSpringApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        eliteClubServiceImpl.addClub("Billionaire", "Environmentalist", "Poker");

        eliteClubServiceImpl.searchClub("Bi");
    }
}
