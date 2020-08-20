package QA.Library.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import QA.Library.Models.ScienceFiction;
import QA.Library.Models.Thriller;
import QA.Library.Repositories.ThrillerRepo;

@Service
public class ThrillerServices {
	
	private ThrillerRepo repo;

	public ThrillerServices(ThrillerRepo repo) {
		this.repo = repo;

	}

	public Thriller insert(Thriller thrill) {
		Thriller done = repo.save(thrill);
		return done;
		
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
			if(newThrill.getAuthor()=="") {
				newThrill.setAuthor(thrill.get().getAuthor());
			}
			if(newThrill.getDate()=="") {
				newThrill.setDate(thrill.get().getDate());
			}
			if(newThrill.getIsbn()=="") {
				newThrill.setIsbn(thrill.get().getIsbn());
			}
			System.out.println(newThrill);
			this.repo.save(newThrill);
			
		}
		
		return thrill.get();
		
	}
	
	public boolean delete(int id) {
		
		boolean find=this.repo.existsById(id);
//		System.out.println("Testing" + find);
		if (find) {
			this.repo.deleteById(id);
		}
		return find;
	}
	
	
	
	
	
	
	
	
	
	
	
//	public boolean delete(int id) {
//		this.repo.deleteById(id);
//		boolean deleted = !this.repo.existsById(id);
//		return deleted;
//	}

}



