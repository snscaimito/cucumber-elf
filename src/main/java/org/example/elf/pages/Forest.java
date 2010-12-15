package org.example.elf.pages;

import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.elf.Elf;
import org.example.elf.services.ElfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Forest {

	private static final Logger LOGGER = LoggerFactory.getLogger(Forest.class) ;
	
	@Property
	private String elfName ;
	
	@Property
	private String elfHeight ;
	
	@Property
	private Elf elf ;
	
	@Inject
	private ElfService elfService ;
	
	public List<Elf> getElves() {
		LOGGER.info("Elves = " + elfService.getElvesSorted()) ;
		return elfService.getElvesSorted() ;
	}
	
	public Object onSuccess() {
		elfService.getElves().add(new Elf(elfName, elfHeight)) ;
		
		return this ;
	}
	
	public Object onActionFromStartOver() {
		elfService.getElves().clear() ;
		return this ;
	}
	
}
