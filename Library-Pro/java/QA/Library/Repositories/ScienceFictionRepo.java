package QA.Library.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QA.Library.Models.ScienceFiction;



@Repository
public interface ScienceFictionRepo extends JpaRepository<ScienceFiction, Integer> {

}
