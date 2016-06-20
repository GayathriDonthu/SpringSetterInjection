package com.setterInjection;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;

	public void getName() {
		System.out.println("your message:"+name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("SpellChecker is called");
		this.spellChecker = spellChecker;
	}
	
	public void call(){
		spellChecker.check();
	}
}
