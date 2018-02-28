package com.org.unittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.org.corejava.FindFirstDuplicateCharacterInString;

public class ToTestTheFirstDuplicateCharacterInaString {
	FindFirstDuplicateCharacterInString fstDuplicateChar;

	@Before
	public void createObj(){
	fstDuplicateChar=new FindFirstDuplicateCharacterInString();
	}
	@Test
	public void testToFindFirstCharacter() {
		Character ch=new Character('q');
		assertEquals(ch, fstDuplicateChar.findFirstDuplicateChar("papu"));
		
		
	}
}
