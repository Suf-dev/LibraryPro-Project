package QA.Library.Controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ScienceFiction insert(@RequestBody ScienceFiction scifi) {
		return serv.insert(scifi);
	}
//	
//	@PostMapping("/insert")
//	public ResponseEntity<ScienceFiction> insert(@RequestBody ScienceFiction scifi){
//		ScienceFiction save = serv.insert(scifi);
//		return new ResponseEntity<>(save,HttpStatus.CREATED);
//	}
	
	@GetMapping("/viewAll")
	public List<ScienceFiction> readAll() {
		return serv.readAll();
	}

	
//	@GetMapping("/viewAll")
//	public ResponseEntity<List<ScienceFiction>> readAll(){
//		List<ScienceFiction> read = serv.readAll();
//		return ResponseEntity.ok(read);
//	}
	
	
	
	@GetMapping("/readbyid/{a}")
	public Optional<ScienceFiction> readByid(@PathVariable(value="a") int sid) {
		return serv.readByid(sid);
	}
	// Inert update from services here
	
	
//	@GetMapping("/readbyid/{a}")
//	public ResponseEntity<Optional<ScienceFiction>> readbyid(@PathVariable(value="a") int sid) {
//		Optional<ScienceFiction> done = serv.readByid(sid);
//		return ResponseEntity.ok(done);
//	}
	
	
	@PostMapping("/update")
	public ScienceFiction update(@RequestBody ScienceFiction scifi) {
		return serv.update(scifi);
	

	}
	
//	@PostMapping("/update")
//	public ResponseEntity<ScienceFiction> update(@RequestBody ScienceFiction scifi) {
//		ScienceFiction replace = serv.update(scifi);
//		return new ResponseEntity<>(replace,HttpStatus.CREATED);
//
//	}
	
//	@DeleteMapping("/delete/{a}")
//	public boolean delete(@PathVariable(value="a") int sid) {
//		return   serv.delete(sid);
		//return deleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
//	}

	
	
//	
//	
	@DeleteMapping("/delete/{a}")
	public boolean delete(@PathVariable(value="a") int sid) {
		return serv.delete(sid);
	}
	

	
	
	}
	
	
	



