package QA.Library.Services;

import java.util.List;
import java.util.Optional;


import QA.Library.Models.Thriller;
import QA.Library.Repositories.ThrillerRepo;

public class ThrillerServices {
	
	private ThrillerRepo repo;

	public ThrillerServices(ThrillerRepo repo) {
		this.repo = repo;

	}

	public String insert(Thriller thriller) {
		repo.save(thriller);
		return "record inserted";
	}
	
//	public ScienceFiction storeRecord(ScienceFiction scienceFiction) {
//		return repo.saveAndFlush(scienceFiction);
//	}

	public List<Thriller> readAll() {
		List<Thriller> thrill = this.repo.findAll();
		return thrill;
	}

	public Optional<Thriller> readByid(int id) {
		Optional<Thriller> record = this.repo.findById(id);
		return record;
	}
	public Thriller update(Thriller newThrill){
		Optional<Thriller> thrill = readByid(newThrill.getTid());
		if(thrill.isPresent()) {
			if (newThrill.getTname()=="") {
				newThrill.setTname(thrill.get().getTname());
			}
			this.repo.save(newThrill);
			
		}
		
		return thrill.get();
		
	}
	public boolean delete(int id) {
		this.repo.deleteById(id);
		boolean deleted = !this.repo.existsById(id);
		return deleted;
	}

}



