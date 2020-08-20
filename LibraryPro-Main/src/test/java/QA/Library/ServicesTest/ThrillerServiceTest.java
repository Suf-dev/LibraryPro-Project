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


import QA.Library.Models.Thriller;
import QA.Library.Repositories.ThrillerRepo;
import QA.Library.Services.ThrillerServices;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ThrillerServiceTest {

	

	@MockBean
	ThrillerRepo repo;

	@Autowired
	ThrillerServices serv;
	
	

	@Test
	public void testInsert() {
		Thriller thrill = new Thriller();
		
		when(repo.save(thrill)).thenReturn(thrill);

		assertEquals(serv.insert(thrill), thrill);

		verify(repo, Mockito.times(1)).save(thrill);
	}


	@Test
	public void testreadAll() {
		List<Thriller> table = new ArrayList<Thriller>();

		table.add(new Thriller("Lopez", "Jennifer Lopez", "19/02/2011", "IDJ6554654"));
		table.add(new Thriller("Albrighton", "Mark Albrighton", "12/05/2013", "JENF64646"));
		table.add(new Thriller("Musk", "Elon Musk", "22/01/2001", "65454654654"));

		when(repo.findAll()).thenReturn((List<Thriller>) table);
		assertEquals(serv.readAll(), table);

	}
	



	@Test
	public void testreadByid() {
		Optional<Thriller> record = Optional.of(new Thriller("Lopez", "Jennifer Lopez", "19/02/2011", "IDJ6554654"));
		when(repo.findById((int) 1)).thenReturn(record);
		assertTrue(serv.readByid((int) 1) instanceof Optional<?>);
	}

	@Test
	public void testUpdate() {
		Thriller thrill = new Thriller();
		Optional<Thriller> option = Optional.of(thrill);
		int id = (int) 1;

		when(repo.findById(thrill.getTid())).thenReturn(option);
		when(repo.save(thrill)).thenReturn(thrill);

		assertEquals(serv.update(thrill), thrill);

	}





	@Test
	public void testDeleteByid() {
		Optional<Thriller> entity = Optional.of(new Thriller(1,"Robots", "Sam Paul", "19/02/2011", "IDJ6554654"));
//	
//	
		when(repo.existsById((int) 1)).thenReturn(true);
//	
		assertTrue(serv.delete((int) 1));

	}


}
