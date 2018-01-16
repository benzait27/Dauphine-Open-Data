package io.github.oliviercailloux.opendata.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ezvcard.VCard;
import io.github.oliviercailloux.opendata.entity.Person;
import io.github.oliviercailloux.opendata.mapper.VcardMapper;

public class VcardMapperTest {

	@Test
	public void testEncodePersonToVcard() {
		Person person = new Person();
		
		person.setFirstName("firstNameTest");
		person.setLastName("lastNameTest");
		
		VcardMapper vcardMapper = new VcardMapper();
		
		VCard vcard = vcardMapper.encodePersonToVcard(person);
		
		assertEquals("firstNameTest", vcard.getStructuredName().getGiven());
		
	}

}
