package org.example.elf;

public class Elf {

	private String elfName ;
	private String elfHeight ;
	
	public Elf(String elfName, String elfHeight) {
		this.elfHeight = elfHeight ;
		this.elfName = elfName ;
	}

	public String getName() {
		return elfName;
	}

	public String getHeight() {
		return elfHeight;
	}
	
	@Override
	public String toString() {
		return "Elf " + elfName ;
	}

}
