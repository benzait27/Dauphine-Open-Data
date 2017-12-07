package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
	private Person author;
	// the name of the course
	private String courseName;
	// All the course type as CM, TD and TP and their volume (number of hours for each type)
	private Set<CourseType> courseTypes = new HashSet<CourseType>() ;
	// the language of the course in witch it' written 
	@Enumerated(EnumType.STRING)
	private TeachingLang teachingLangs ;
	// the course's credit
	private int credits;
	 
	public Course() {
		
		}

	public Course(String idCourse, String description, Person author, String courseName, HashSet<CourseType> courseTypes,
		TeachingLang teachingLangs, int credits) {
		this.idCourse = idCourse;
		this.description = description;
		this.author = author;
		this.courseName = courseName;
		this.courseTypes = courseTypes;
		this.teachingLangs = teachingLangs;
		this.credits = credits;
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

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<CourseType> getCourseTypes() {
		return courseTypes;
	}

	public void setCourseTypes(Set<CourseType> courseTypes) {
		this.courseTypes = courseTypes;
	}

	public TeachingLang getTeachingLangs() {
		return teachingLangs;
	}

	public void setTeachingLangs(TeachingLang teachingLangs) {
		this.teachingLangs = teachingLangs;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	
	
}
