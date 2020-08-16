package QA.Library.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import QA.Library.Models.Biography;
import QA.Library.Repositories.BiographyRepo;


@Service
public class BiographyServices {
	
	private BiographyRepo repo;

	public BiographyServices(BiographyRepo repo) {
		this.repo = repo;

	}

	public String insert(Biography bio) {
		repo.save(bio);
		return "record inserted";
	}
	
//	public ScienceFiction storeRecord(ScienceFiction scienceFiction) {
//		return repo.saveAndFlush(scienceFiction);
//	}

	public List<Biography> readAll() {
		List<Biography> scifi = this.repo.findAll();
		return scifi;
	}

	public Optional<Biography> readByid(int id) {
		Optional<Biography> record = this.repo.findById(id);
		return record;
	}
	public Biography update(Biography newBio){
		Optional<Biography> bio = readByid(newBio.getBid());
		if(bio.isPresent()) {
			if (newBio.getBname()=="") {
				newBio.setBname(bio.get().getBname());
			}
			this.repo.save(newBio);
			
		}
		
		return bio.get();
		
	}
	public boolean delete(int id) {
		this.repo.deleteById(id);
		boolean deleted = !this.repo.existsById(id);
		return deleted;
	}

}
	
	


