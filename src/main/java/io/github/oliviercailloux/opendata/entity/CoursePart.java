package io.github.oliviercailloux.opendata.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * CourseType is an  object to represent type of course {( TD,30H), (CM,15H), ...}. 
 * @author     Zakaria BENZAIT  
 * @author     Ouafa BOUCENNA
 * @version     %I%, %G%
 * @since       1.0
 */
@Entity
public class CoursePart {
	
	
	/**
     *  The id CoursePart
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String idCoursePart;
	public String getIdCoursePart() {
		return idCoursePart;
	}

	public void setIdCoursePart(String idCoursePart) {
		this.idCoursePart = idCoursePart;
	}
	/**
	 * the type of the course (TD, CM )
	 */
	private CourseType type;
	/**
	 * The number of hourly volume
	 */
	private int volume;
	/**
	 * The teacher
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	Person teacher ;
	
	
	public Person getTeacher() {
		return teacher;
	}

	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}

	/**
	 * Constructor with field
	 * @param type The type of the course
	 * @param volume The number of the hours reserved to this course
	 */
	public CoursePart(CourseType type, int volume) {
		super();
		this.type = type;
		this.volume = volume;
	}
	/**
	 * Constructor without fields
	 */
	public CoursePart() {
		super();
	}
	
	public CourseType getType() {
		return type;
	}
	public void setType(CourseType type) {
		this.type = type;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

}
