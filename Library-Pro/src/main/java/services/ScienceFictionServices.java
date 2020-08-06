package services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import models.ScienceFiction;
import repositories.ScienceFictionRepo;

@Service
public class ScienceFictionServices {

	private ScienceFictionRepo repo;

	public ScienceFictionServices(ScienceFictionRepo repo) {
		this.repo = repo;

	}

	public String insert(ScienceFiction scifi) {
		repo.save(scifi);
		return "record inserted";
	}

	public List<ScienceFiction> readAll() {
		List<ScienceFiction> scifi = this.repo.findAll();
		return scifi;
	}

	public Optional<ScienceFiction> readByid(Long id) {
		Optional<ScienceFiction> record = this.repo.findById(id);
		return record;
	}
//	public ScienceFiction update(ScienceFiction newSciFi, Long id){
//		Optional<ScienceFiction> scifi = readByid(id);
//	
//		ScienceFiction record = this.repo.save(scifi);
//		return record;
//		
//	}
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		boolean deleted = !this.repo.existsById(id);
		return deleted;
	}

}
