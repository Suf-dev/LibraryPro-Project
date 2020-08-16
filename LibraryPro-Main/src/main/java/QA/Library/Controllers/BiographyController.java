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

import QA.Library.Models.Biography;
import QA.Library.Repositories.BiographyRepo;
import QA.Library.Services.BiographyServices;


@RestController
@CrossOrigin
public class BiographyController {
	
	@Autowired
	BiographyRepo repo;
	
	@Autowired
	BiographyServices serv;
	

	
	@GetMapping("/save")
	public String saveRecord() {
		Biography s = new Biography();
		s.setBname("Brains");
		s.setAuthor("James Patterson");
		s.setDate("07/22/1995");
		s.setIsbn("ISO12894FRI3");
		
		repo.save(s);
		return "Record saved";
	}


	@PostMapping("/insert")
	public String insert(@RequestBody Biography bio) {
		return serv.insert(bio);
	}
	
//	@PostMapping("/saveRecord")
//	public ResponseEntity<ScienceFiction> addRecord (@RequestBody ScienceFiction fiction){
//		ScienceFiction save = serv.storeRecord(fiction);
//		return new ResponseEntity<>(save,HttpStatus.CREATED);
//	}
	
	@GetMapping("/viewAll")
	public List<Biography> readAll() {
		return serv.readAll();
	}
	
	@GetMapping("/readbyid/{a}")
	public Optional<Biography> readByid(@PathVariable(value="a") int bid) {
		return serv.readByid(bid);
	}
	// Inert update from services here
	
	@PostMapping("/update")
	public Biography update(@RequestBody Biography bio) {
		return serv.update(bio);
	}
	
	
	
	
	@DeleteMapping("/delete/{a}")
	public boolean delete(@PathVariable(value="a") int bid) {
		return serv.delete(bid);
	}
	
	}
	


