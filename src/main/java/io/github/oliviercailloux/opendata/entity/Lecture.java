package io.github.oliviercailloux.opendata.entity;



import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

import com.google.common.base.Strings;

import io.github.oliviercailloux.opendata.utils.DateUtils;

/**
 * Created by Ziad & Sofian on 03/12/2017.
 * class that represents a lecture with a date, a room, and a group of participants
 */
public class Lecture {


    /**
     exemple of object use in  planning of Paris Dauphine
     "com.adesoft.gwt.core.client.rpc.data.planning.SquareEvent/3694954416"
     "java.lang.Integer/3438268394"
     "java.lang.String/2004016611"
     "Conception agile d'appli Web en java"
     "CAILLOUX OLIVIER"
     "A5STI86 Gr01"
     "U_B042"
     "38-UNIX"
     "M2 IF"

    **/

    DateUtils dateUtils;

    /**
     * Course (basic information about course (author, type ...)
     */
    private Course course = new Course();

    /**
     *  Date of course , we have a getter with date format
     */
    private Date date = new Date();

    /**
     *  ROOM must be defined in a separate class with  multiple information
     *  U_B042"  38-UNIX
     */
    private String room = "";

    /**
     * Group of participants must be defined in a separate class with name and ID
     * A5STI86 Gr01
     * M2 IF
     */
    private String group = "";

    /**
     *
     *
     *   the teacher responsible for the lecture.
     */
    private Person teacher = new Person();



    public Lecture() {
    }

    public Lecture(Course course, Date date) {
        this.course = Objects.requireNonNull(course);
        this.date = Objects.requireNonNull(date);
    }
    
    public Lecture(Course course, Date date, String room, String group, Person teacher) {
        this.course = Objects.requireNonNull(course);
        this.date = Objects.requireNonNull(date);
        this.room = Strings.nullToEmpty(room);
        this.group = Strings.nullToEmpty(group);
        this.teacher = Objects.requireNonNull(teacher);
    }


    /**
     *  Méthode who return date attribute with format defined in param
     * @param format is optional and if null return default format JJ/MM/YYYY HH:MM
     * @return
     */
    public String getDateWithFormat( String format){
        return DateUtils.transformDate(this.date, Optional.ofNullable(format));
    }

	/**
	 * Returns this lecture's course.
	 *
	 * @return not <code>null</code>.
	 */
    public Course getCourse() {
        return course;
    }

	/**
	 * Sets this lecture's course.
	 *
	 * @param course
	 *            can't be <code>null</code>
	 */
    public void setCourse(Course course) {
        this.course = Objects.requireNonNull(course);
    }

	/**
	 * Returns this lecture's date.
	 *
	 * @return not <code>null</code>.
	 */
    public Date  getDate() {
        return date;
    }

	/**
	 * Sets this lecture's date.
	 *
	 * @param date
	 *            can't be <code>null</code>
	 */
    public void setDate(Date date) {
        this.date = Objects.requireNonNull(date);
    }

	/**
	 * Returns this lecture's room, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
    public String getRoom() {
        return room;
    }

	/**
	 * Sets this lecture's room.
	 *
	 * @param room
	 *            if <code>null</code>, will be converted to an empty string.
	 */
    public void setRoom(String room) {
        this.room = Strings.nullToEmpty(room);
    }

	/**
	 * Returns this lecture's group, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
    public String getGroup() {
        return group;
    }

	/**
	 * Sets this lecture's group.
	 *
	 * @param group
	 *            if <code>null</code>, will be converted to an empty string.
	 */
    public void setGroup(String group) {
        this.group = Strings.nullToEmpty(group);
    }

	/**
	 * Returns this lecture's teacher.
	 *
	 * @return not <code>null</code>.
	 */
    public Person getTeacher() {
        return teacher;
    }

	/**
	 * Sets this lecture's teacher.
	 *
	 * @param teacher
	 *            can't be <code>null</code>
	 */
    public void setTeacher(Person teacher) {
        this.teacher = Objects.requireNonNull(teacher);
    }
}
