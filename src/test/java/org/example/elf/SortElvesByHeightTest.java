package org.example.elf;

import static org.junit.Assert.assertEquals;

import org.example.elf.services.ElfService;
import org.junit.Test;

public class SortElvesByHeightTest {

	@Test
	public void convertHeight() {
		ElfService elfService = new ElfService() ;
		
		assertEquals(462, elfService.getHeightInInch("6' 30\""), 0) ;
	}

	@Test
	public void orderElves() {
		ElfService elfService = new ElfService();

		elfService.add(new Elf("Sara", "2' 40"));
		elfService.add(new Elf("Kara", "3' 40"));

		assertEquals("Kara", elfService.getElvesSorted().get(0).getName());
		assertEquals("Sara", elfService.getElvesSorted().get(1).getName());
	}

}


 