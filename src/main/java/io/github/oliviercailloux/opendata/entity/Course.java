package io.github.oliviercailloux.opendata.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import com.google.common.base.Strings;



@Entity
/**
 * Course object to represent a Dauphine course.
 * @author     Zakaria BENZAIT
 * @author     Ouafa BOUCENNA
 * @version     %I%, %G%
 * @since       1.0
 */
public class Course implements Serializable {
	

	private static final long serialVersionUID = 1L;
	/**
     *  The id Course
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String idCourse;
	/**
     *  the description course
     */
	private String description = "";
	/**
     * List of teachers and witch kind of course they will teach
     */
	private Set<CoursePart> coursePart = new HashSet<CoursePart>() ;
	
	public Set<CoursePart> getCoursePart() {
		return coursePart;
	}

	public void setCoursePart(Set<CoursePart> coursePart) {
		this.coursePart = coursePart;
	}

	/**
     * The name of the course
     */ 
	private String courseName = "";
	/**
     * the language of the course in witch it written 
     */
	private Locale locale ;
	/**
     * The course's credit
     */
	private int credits;
	/**
     * The course specialty
     */
	private TypeSpecialty specialty;
	
	 /** 
	  * Course constructor without fields
     */
	public Course() {
		
	}

	/** 
	  * Course constructor with fields
	  * 
	  * @param courseName  the name of the course ( Big Data, ...)
    */
	public Course( String courseName) {
		this.courseName = Strings.nullToEmpty(courseName);
	}

	// put the idCourse on property of the element


	/**
	 * Returns this course's id, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
	public String getIdCourse() {
		return idCourse;
	}

	/**
	 * Sets this course's id.
	 *
	 * @param idCourse
	 *            if <code>null</code>, will be converted to an empty string.
	 */
	public void setIdCourse(String idCourse) {
		this.idCourse = Strings.nullToEmpty(idCourse);
	}

	/**
	 * Returns this course's description, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets this course's description.
	 *
	 * @param description
	 *            if <code>null</code>, will be converted to an empty string.
	 */
	public void setDescription(String description) {
		this.description = Strings.nullToEmpty(description);
	}
	/**
	 * Returns this course's name, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * Sets this course's name.
	 *
	 * @param courseName
	 *            if <code>null</code>, will be converted to an empty string.
	 */
	public void setCourseName(String courseName) {
		this.courseName = Strings.nullToEmpty(courseName);
	}


	/**
	 * Returns this course's locale.
	 *
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * Sets this course's locale.
	 *
	 * @param locale
	 */
	public void setLocale(Locale locale) {
		this.locale= locale;
	}

	/**
	 * Returns this course's credits.
	 *
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * Sets this course's credits.
	 *
	 * @param credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * Returns this course's specialty.
	 *
	 */
	public TypeSpecialty getSpecialty() {
		return specialty;
	}

	/**
	 * Sets this course's specialty.
	 *
	 * @param specialty
	 */
	public void setSpecialty(TypeSpecialty specialty) {
		this.specialty= specialty;
	}
	
}
