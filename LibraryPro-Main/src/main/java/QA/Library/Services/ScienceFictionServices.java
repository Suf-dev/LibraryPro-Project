package QA.Library.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import QA.Library.Models.ScienceFiction;
import QA.Library.Repositories.ScienceFictionRepo;



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
	
//	public ScienceFiction storeRecord(ScienceFiction scienceFiction) {
//		return repo.saveAndFlush(scienceFiction);
//	}

	public List<ScienceFiction> readAll() {
		List<ScienceFiction> scifi = this.repo.findAll();
		return scifi;
	}

	public Optional<ScienceFiction> readByid(int id) {
		Optional<ScienceFiction> record = this.repo.findById(id);
		return record;
	}
	public ScienceFiction update(ScienceFiction newSciF){
		Optional<ScienceFiction> scifi = readByid(newSciF.getSid());
		if(scifi.isPresent()) {
			if (newSciF.getSname()=="") {
				newSciF.setSname(scifi.get().getSname());
			}
			if(newSciF.getAuthor()=="") {
				newSciF.setAuthor(scifi.get().getAuthor());
			}
			if(newSciF.getDate()=="") {
				newSciF.setDate(scifi.get().getDate());
			}
			if(newSciF.getIsbn()=="") {
				newSciF.setIsbn(scifi.get().getIsbn());
			}
			System.out.println(newSciF);
			this.repo.save(newSciF);
			
		}
		
		return scifi.get();
		
	}
	public boolean delete(int id) {
		this.repo.deleteById(id);
		boolean deleted = !this.repo.existsById(id);
		return deleted;
	}

}
