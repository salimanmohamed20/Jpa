package org.example.jpatraining.repo;

import org.example.jpatraining.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section,Long> {
}
