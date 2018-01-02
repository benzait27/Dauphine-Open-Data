package mapper;

import entity.Person;
import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.property.Expertise;
import ezvcard.property.Organization;
import ezvcard.property.StructuredName;

public class VcardMapper {

	public VcardMapper() {
	}
	
	public VCard encodePersonToVcard(Person person) {
		
		VCard vcard = new VCard();
		
		if (person.getFirstName() != null && person.getLastName() != null) {
			StructuredName n = new StructuredName();
			
			n.setFamily(person.getLastName());
			n.setGiven(person.getFirstName());
			vcard.setStructuredName(n);
			vcard.setFormattedName(person.getFirstName() + " " + person.getLastName());
			
		}
		
		if (person.getEmails() != null) {
			person.getEmails().forEach((mail) -> {
				vcard.addEmail(mail);
			});
		}
		
		if (person.getStructures() != null) {
			vcard.setOrganization(person.getStructures().get(0));	
		}

		if (person.getNumber() != null) {
		vcard.addTelephoneNumber(person.getNumber());
		}
		
		if (person.getFunction() != null) {
			vcard.addExpertise(new Expertise(person.getFunction().toString()));
		}
		
		return vcard;
	}
	
}