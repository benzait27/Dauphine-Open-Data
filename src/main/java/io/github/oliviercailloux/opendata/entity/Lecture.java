package io.github.oliviercailloux.opendata.entity;



import java.time.LocalDateTime;
import java.util.Optional;

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
    private Course course;

    /**
     *  Date of course , we have a getter with date format
     */
    private LocalDateTime date;

    /**
     *  ROOM must be defined in a separate class with  multiple information
     *  U_B042"  38-UNIX
     */
    private String room;

    /**
     * Group of participants must be defined in a separate class with name and ID
     * A5STI86 Gr01
     * M2 IF
     */
    private String group;


    public Lecture() {
    }

    public Lecture(Course course, LocalDateTime date, String room, String group) {
        this.course = course;
        this.date = date;
        this.room = room;
        this.group = group;
    }

    /**
     *  Méthode who return date attribute with format defined in param
     * @param format is optional and if null return default format JJ/MM/YYYY HH:MM
     * @return
     */
    public String getDateWithFormat( String format){

        return DateUtils.transformDate(this.date, Optional.ofNullable(format));
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDateTime  getDate() {
        return date;
    }


    public void setDate(LocalDateTime  date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
