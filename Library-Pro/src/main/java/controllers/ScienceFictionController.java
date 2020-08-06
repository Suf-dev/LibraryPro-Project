package controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import models.ScienceFiction;
import repositories.ScienceFictionRepo;
import services.ScienceFictionServices;

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
		s.setName("Brains");
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
	
	@GetMapping("/viewAll")
	public List<ScienceFiction> readAll() {
		return serv.readAll();
	}
	
	@PostMapping("/readbyid")
	public Optional<ScienceFiction> readByid(@RequestBody Long id) {
		return serv.readByid(id);
	}
	// Inert update from services here
	
	
	@DeleteMapping("/delete")
	public boolean delete(Long id) {
		return serv.delete(id);
	}
	
	}
	
	
	



