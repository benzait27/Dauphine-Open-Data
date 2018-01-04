package io.github.oliviercailloux.opendata.entity;

/**
 * CourseType is an  object to represent type of course {( TD,30H), (CM,15H), ...}. 
 * @author     Zakaria BENZAIT  
 * @author     Ouafa BOUCENNA
 * @version     %I%, %G%
 * @since       1.0
 */

public class CourseType {
	
	/**
	 * the type of the course (TD, CM )
	 */
	private TypeCourse type;
	/**
	 * The number of hourly volume
	 */
	private int volume;
	
	
	/**
	 * Constructor with field
	 * @param type The type of the course
	 * @param volume The number of the hours reserved to this course
	 */
	public CourseType(TypeCourse type, int volume) {
		super();
		this.type = type;
		this.volume = volume;
	}
	
	public TypeCourse getType() {
		return type;
	}
	public void setType(TypeCourse type) {
		this.type = type;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

}
