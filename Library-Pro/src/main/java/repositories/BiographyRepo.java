package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Biography;

@Repository
public interface BiographyRepo extends JpaRepository<Biography, Integer> {

}
