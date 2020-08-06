package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Thriller;

@Repository 
public interface ThrillerRepo extends JpaRepository <Thriller, Integer> {

}
