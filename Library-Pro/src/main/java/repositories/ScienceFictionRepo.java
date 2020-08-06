package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.ScienceFiction;

@Repository
public interface ScienceFictionRepo extends JpaRepository<ScienceFiction, Long> {

}
