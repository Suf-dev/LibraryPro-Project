package QA.Library.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import QA.Library.Models.Thriller;
import QA.Library.Repositories.ThrillerRepo;
import QA.Library.Services.ThrillerServices;

@RestController 
public class ThrillerController {
	
	@Autowired
	ThrillerRepo repo;
	
	@Autowired
	ThrillerServices serv;
	

	
	@GetMapping("/save")
	public String saveRecord() {
		Thriller s = new Thriller();
		s.setTname("Brains");
		s.setAuthor("James Patterson");
		s.setDate("07/22/1995");
		s.setIsbn("ISO12894FRI3");
		
		repo.save(s);
		return "Record saved";
	}


	@PostMapping("/insert")
	public String insert(@RequestBody Thriller thriller) {
		return serv.insert(thriller);
	}
	
//	@PostMapping("/saveRecord")
//	public ResponseEntity<ScienceFiction> addRecord (@RequestBody ScienceFiction fiction){
//		ScienceFiction save = serv.storeRecord(fiction);
//		return new ResponseEntity<>(save,HttpStatus.CREATED);
//	}
	
	@GetMapping("/viewAll")
	public List<Thriller> readAll() {
		return serv.readAll();
	}
	
	@GetMapping("/readbyid/{a}")
	public Optional<Thriller> readByid(@PathVariable(value="a") int tid) {
		return serv.readByid(tid);
	}
	// Inert update from services here
	
	@PostMapping("/update")
	public Thriller update(@RequestBody Thriller thriller) {
		return serv.update(thriller);
	}
	
	
	
	
	@DeleteMapping("/delete/{a}")
	public boolean delete(@PathVariable(value="a") int tid) {
		return serv.delete(tid);
	}
	
	}


