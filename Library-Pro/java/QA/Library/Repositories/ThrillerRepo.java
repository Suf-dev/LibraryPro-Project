package QA.Library.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QA.Library.Models.Thriller;


@Repository 
public interface ThrillerRepo extends JpaRepository <Thriller, Integer> {

}
