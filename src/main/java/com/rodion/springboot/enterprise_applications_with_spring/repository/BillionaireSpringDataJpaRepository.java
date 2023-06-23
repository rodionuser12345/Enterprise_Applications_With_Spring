package com.rodion.springboot.enterprise_applications_with_spring.repository;

import com.rodion.springboot.enterprise_applications_with_spring.model.Billionaires;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillionaireSpringDataJpaRepository extends JpaRepository<Billionaires, Long> {
}
