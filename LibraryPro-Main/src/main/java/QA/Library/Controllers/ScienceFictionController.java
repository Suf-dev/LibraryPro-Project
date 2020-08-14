package QA.Library.Controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import QA.Library.Models.ScienceFiction;
import QA.Library.Repositories.ScienceFictionRepo;
import QA.Library.Services.ScienceFictionServices;





@RestController
@CrossOrigin
public class ScienceFictionController {
	
	@Autowired
	ScienceFictionRepo repo;
	
	@Autowired
	ScienceFictionServices serv;
	

	
	@GetMapping("/save")
	public String saveRecord() {
		ScienceFiction s = new ScienceFiction();
		s.setSname("Brains");
		s.setAuthor("James Patterson");
		s.setDate("07/22/1995");
		s.setIsbn("ISO12894FRI3");
		
		repo.save(s);
		return "Record saved";
	}


	@PostMapping("/insert")
	public String insert(@RequestBody ScienceFiction scifi) {
		return serv.insert(scifi);
	}
	
//	@PostMapping("/saveRecord")
//	public ResponseEntity<ScienceFiction> addRecord (@RequestBody ScienceFiction fiction){
//		ScienceFiction save = serv.storeRecord(fiction);
//		return new ResponseEntity<>(save,HttpStatus.CREATED);
//	}
	
	@GetMapping("/viewAll")
	public List<ScienceFiction> readAll() {
		return serv.readAll();
	}
	
	@GetMapping("/readbyid/{a}")
	public Optional<ScienceFiction> readByid(@PathVariable(value="a") int sid) {
		return serv.readByid(sid);
	}
	// Inert update from services here
	
	@PostMapping("/update")
	public ScienceFiction update(@RequestBody ScienceFiction scifi) {
		return serv.update(scifi);
	}
	
	
	
	
	@DeleteMapping("/delete/{a}")
	public boolean delete(@PathVariable(value="a") int sid) {
		return serv.delete(sid);
	}
	
	}
	
	
	



