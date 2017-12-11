package entity;

import java.util.HashSet;
import java.util.Set;

// this class to save to link between the teacher and witch kind of course he could does (TD, CM ...)
public class PersonAndCourseType {
	Person p ;
	private Set<CourseType> courseTypes = new HashSet<CourseType>() ;
	
	
	public PersonAndCourseType(Person p,Set<CourseType> ct) {
		super();
		this.p = p;
		this.courseTypes = ct;
	}
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public HashSet<CourseType> getcourseTypes() {
		return (HashSet<CourseType>) courseTypes;
	}
	public void setcourseTypes(HashSet<CourseType> ct) {
		this.courseTypes = ct;
	}

}
