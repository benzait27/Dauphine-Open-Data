package io.github.oliviercailloux.opendata.entity;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class ObjectsXML {
	
	
	public ObjectsXML() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void encodingCourse(Course c, String fileName) throws NullPointerException , IllegalArgumentException {
		try {
			//creation the JAXB contexte under the Course classe
		    JAXBContext context = JAXBContext.newInstance(Course.class) ;
		  
		    //creation of the marshaller from this contexte
		    Marshaller marshaller = context.createMarshaller() ;
		    
		    // chose the UTF-8 for the encoding file
		    marshaller.setProperty("jaxb.encoding",  "UTF-8") ;
		    
		    // ask JAXB to format the file so it can be read by the eye 
		    marshaller.setProperty("jaxb.formatted.output", true) ;
		    
		    //write the XML file on the fileName
		    marshaller.marshal(c,  new File(fileName)) ;
			} catch (JAXBException ex) {
			ex.printStackTrace();
			}
		   catch (NullPointerException ex) {
			ex.printStackTrace();
			}
		   catch (IllegalArgumentException ex) {
			ex.printStackTrace();
			}
	}
	
    public Course decodingCourse() {
		Course c = null;
    	
    	return c;
	}

}
