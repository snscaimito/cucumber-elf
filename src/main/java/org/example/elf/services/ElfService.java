package org.example.elf.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.example.elf.Elf;

public class ElfService {

	private List<Elf> elves = new ArrayList<Elf>() ;
	
	public List<Elf> getElves() {
		return elves ;
	}

	public double getHeightInInch(String height) {
		String[] parts = height.split("'|\"") ;
		
		return Double.parseDouble(parts[0]) * 72 + Double.parseDouble(parts[1]) ;
	}

	public void add(Elf elf) {
		elves.add(elf) ;
	}

	public List<Elf> getElvesSorted() {
		Collections.sort(elves, new Comparator<Elf>() {

			public int compare(Elf elf1, Elf elf2) {
				Double elfAHeight = getHeightInInch(elf1.getHeight()) ;
				Double elfBHeight = getHeightInInch(elf2.getHeight()) ;
				
				return elfBHeight.compareTo(elfAHeight) ;
			}
		}) ;
		
		return elves ;
	}
	
}
