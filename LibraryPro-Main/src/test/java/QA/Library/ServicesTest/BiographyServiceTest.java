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

import QA.Library.Models.Biography;
import QA.Library.Repositories.BiographyRepo;
import QA.Library.Services.BiographyServices;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BiographyServiceTest {
	

	@MockBean
	BiographyRepo brepo;

	@Autowired
	BiographyServices sserv;

	

	@Test
	public void testInsert() {
		Biography bio = new Biography();
		
		when(brepo.save(bio)).thenReturn(bio);

		assertEquals(sserv.insert(bio), bio);

		verify(brepo, Mockito.times(1)).save(bio);
	}


	@Test
	public void testreadAll() {
		List<Biography> table = new ArrayList<Biography>();

		table.add(new Biography("Lopez", "Jennifer Lopez", "19/02/2011", "IDJ6554654"));
		table.add(new Biography("Albrighton", "Mark Albrighton", "12/05/2013", "JENF64646"));
		table.add(new Biography("Musk", "Elon Musk", "22/01/2001", "65454654654"));

		when(brepo.findAll()).thenReturn((List<Biography>) table);
		assertEquals(sserv.readAll(), table);

	}
	



	@Test
	public void testreadByid() {
		Optional<Biography> record = Optional.of(new Biography("Lopez", "Jennifer Lopez", "19/02/2011", "IDJ6554654"));
		when(brepo.findById((int) 1)).thenReturn(record);
		assertTrue(sserv.readByid((int) 1) instanceof Optional<?>);
	}

	@Test
	public void testUpdate() {
		Biography bio = new Biography();
		Optional<Biography> option = Optional.of(bio);
		int id = (int) 1;

		when(brepo.findById(bio.getBid())).thenReturn(option);
		when(brepo.save(bio)).thenReturn(bio);

		assertEquals(sserv.update(bio), bio);

	}





	@Test
	public void testDeleteByid() {
		Optional<Biography> entity = Optional.of(new Biography(1,"Robots", "Sam Paul", "19/02/2011", "IDJ6554654"));
//	
//	
		when(brepo.existsById((int) 1)).thenReturn(true);
//	
		assertTrue(sserv.delete((int) 1));

	}


}


