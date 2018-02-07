package io.github.oliviercailloux.opendata.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Ziad & sofian on 07/02/2017.
 *  triple is a class to create data attached to a subject (id) and put a predicate and an object
 */
@Entity
public class Triple {


    /**
     * id of a triple
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

	/**
	 *  subject is a string containing an id of an object (person or course
	 */
	String subject;

	/**
	 *  the predicate attached to the subject
	 */
	String predicate;

	/**
	 *  object is a string containing the data
	 */
	String object;

    public Triple() {
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}
}
