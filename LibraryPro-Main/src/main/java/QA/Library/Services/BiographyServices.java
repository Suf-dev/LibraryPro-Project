package QA.Library.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import QA.Library.Models.Biography;
import QA.Library.Models.ScienceFiction;
import QA.Library.Repositories.BiographyRepo;


@Service
public class BiographyServices {
	
	private BiographyRepo repo;

	public BiographyServices(BiographyRepo repo) {
		this.repo = repo;

	}

	public Biography insert(Biography bio) {
		Biography done = repo.save(bio);
		return done;
		
	}
	


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
			if(newBio.getAuthor()=="") {
				newBio.setAuthor(bio.get().getAuthor());
			}
			if(newBio.getDate()=="") {
				newBio.setDate(bio.get().getDate());
			}
			if(newBio.getIsbn()=="") {
				newBio.setIsbn(bio.get().getIsbn());
			}
			System.out.println(newBio);
			this.repo.save(newBio);
			
		}
		
		return bio.get();
	}
		
		
		public boolean delete(int id) {
			
			boolean find=this.repo.existsById(id);
//			System.out.println("Testing" + find);
			if (find) {
				this.repo.deleteById(id);
			}
			return find;
		}
		
		
	}
//	public boolean delete(int id) {
//		this.repo.deleteById(id);
//		boolean deleted = !this.repo.existsById(id);
//		return deleted;
//	}


	
	


