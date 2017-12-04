package mapper;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Person;
import ezvcard.VCard;

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
