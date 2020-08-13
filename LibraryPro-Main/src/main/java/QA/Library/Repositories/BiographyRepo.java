package QA.Library.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QA.Library.Models.Biography;


@Repository
public interface BiographyRepo extends JpaRepository<Biography, Integer> {

}
