package QA.Library.ServicesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import QA.Library.Models.ScienceFiction;
import QA.Library.Repositories.ScienceFictionRepo;
import QA.Library.Services.ScienceFictionServices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScienceFictionServiceTest {
	

	@MockBean
	ScienceFictionRepo repo;

	@Autowired
	ScienceFictionServices serv;

	@Test
	public void testinsert() {
		ScienceFiction scifi = new ScienceFiction();
		
		when(repo.save(scifi)).thenReturn(scifi);

		assertEquals(serv.insert(scifi), scifi);

		verify(repo, Mockito.times(1)).save(scifi);
	}


	@Test
	public void testreadAll() {
		List<ScienceFiction> table = new ArrayList<ScienceFiction>();

		table.add(new ScienceFiction("Robots", "Sam Paul", "19/02/2011", "IDJ6554654"));
		table.add(new ScienceFiction("Steel Man", "Mark Jacob", "12/05/2013", "JENF64646"));
		table.add(new ScienceFiction("Electro Fan", "John Adams", "22/01/2001", "65454654654"));

		when(repo.findAll()).thenReturn((List<ScienceFiction>) table);
		assertEquals(serv.readAll(), table);

	}


//@Test
//public void testUpdate() {
//	Card newCard = new Card("hjbfihjb", "fd", "vdsf");
//	Optional <Card> optionCard = Optional.of(newCard);
//	long id = (long) 1;
//	
//	when(repo.findById(id)).thenReturn(optionCard);
//	when(repo.save(newCard)).thenReturn(newCard);
//	
//	assertEquals(cardService.update(newCard, id), newCard);
//	
//}
//
//
//public Card update(Card newCard, Long id) {
//	Card found = read(id);
//
//	found.setColour(newCard.getColour());
//	found.setCost(newCard.getCost());
//	found.setName(newCard.getName());
//
//	Card saved = this.repo.save(found);
//	return saved;
//}

//-------------------------------------------------------------------------------------

//public ScienceFiction update(ScienceFiction newSciF){
//	Optional<ScienceFiction> scifi = readByid(newSciF.getSid());
//	if(scifi.isPresent()) {
//		if (newSciF.getSname()=="") {
//			newSciF.setSname(scifi.get().getSname());
//		}
//		if(newSciF.getAuthor()=="") {
//			newSciF.setAuthor(scifi.get().getAuthor());
//		}
//		if(newSciF.getDate()=="") {
//			newSciF.setDate(scifi.get().getDate());
//		}
//		if(newSciF.getIsbn()=="") {
//			newSciF.setIsbn(scifi.get().getIsbn());
//		}
////		System.out.println(newSciF);
//		this.repo.save(newSciF);
//		
//	}
//	return scifi.get();
//	
//}

//-------------------------------------------------------------------------------------

	@Test
	public void testreadByid() {
		Optional<ScienceFiction> record = Optional.of(new ScienceFiction("Robots", "Sam Paul", "19/02/2011", "IDJ6554654"));
		when(repo.findById((int) 1)).thenReturn(record);
		assertTrue(serv.readByid((int) 1) instanceof Optional<?>);
	}

	@Test
	public void testUpdate() {
		ScienceFiction scifi = new ScienceFiction();
		Optional<ScienceFiction> option = Optional.of(scifi);
		int id = (int) 1;

		when(repo.findById(scifi.getSid())).thenReturn(option);
		when(repo.save(scifi)).thenReturn(scifi);

		assertEquals(serv.update(scifi), scifi);

	}

//-------------------------------------------------------------------------------------

//}
//public boolean delete(int id) {
//	this.repo.deleteById(id);
//	boolean deleted = !this.repo.existsById(id);
//	return deleted;
//}

//-------------------------------------------------------------------------------------

	@Test
	public void testDeleteByid() {
//		Optional<ScienceFiction> entity = new ScienceFiction(1, "kwemf", "lkwmf", "l3kmfr", ";kwmef");
		Optional<ScienceFiction> entity = Optional.of(new ScienceFiction(1,"Robots", "Sam Paul", "19/02/2011", "IDJ6554654"));
//	
//	
//		when(repo.findById((int) 1)).thenReturn(entity);
		when(repo.existsById((int) 1)).thenReturn(true);
//	
//		when(repo.findById((int) 1)).thenReturn(entity).thenReturn(null);
		assertTrue(serv.delete((int) 1));

//		assertTrue(serv.readByid((int) 1), false);
	}


}
