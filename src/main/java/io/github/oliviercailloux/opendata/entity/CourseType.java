package io.github.oliviercailloux.opendata.entity;

public class CourseType {
	
	private TypeCourse type;
	private int volume;
	
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
