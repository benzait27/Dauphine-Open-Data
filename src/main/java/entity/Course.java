package entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.ejb.Local;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import ch.qos.logback.core.subst.Token.Type;
@XmlRootElement(name="Course", namespace="Course2")
@Entity

public class Course  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idCourse;
	// the description course
	private String description;	
	// replace String author by Person author (Basics)
	private Set<PersonAndCourseType> teachersAndCourseType;
	// the name of the course
	private String courseName;
	// the language of the course in witch it' written 
	private Locale teachingLangs ;
	// the course's credit
	private int credits;
	// le parcours 
	private TypeParcours  parcours ;
	
	
	
	
	public Course() {
		
		}

	public Course( String courseName) {
		this.courseName = courseName;
	}

	// put the idCourse on property of the element
	@XmlAttribute(name="idCourse")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public String getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(String idCourse) {
		this.idCourse = idCourse;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<PersonAndCourseType>  getAuthor() {
		return teachersAndCourseType;
	}

	public void setAuthor(Set<PersonAndCourseType> teachersAndCourseType) {
		this.teachersAndCourseType =  teachersAndCourseType;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Locale getTeachingLangs() {
		return teachingLangs;
	}

	public void setTeachingLangs(Locale teachingLangs) {
		this.teachingLangs = teachingLangs;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public TypeParcours getParcours() {
		return parcours;
	}

	public void setParcours(TypeParcours parcours) {
		this.parcours = parcours;
	}

	
}
