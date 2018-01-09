package io.github.oliviercailloux.opendata.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Ziad  & Sofian on 03/12/2017.
 * object planning by user
 */
public class Planning {

	/**
	 * The person whose planning it is (with all the lectures they are enrolled in)
	 */
    private Person person;

    /**
     * depending on the future treatment, we can replace
     *  by arrayList or Linkedlist or stream in java 8 ?
	 *  Not <code>null</code>.
     */
    private List<Lecture> lectures;

    public Planning(Person person) {
    	this.person = Objects.requireNonNull(person);
		this.lectures = new ArrayList<>();
	}
    
    public Planning(Person person, List<Lecture> lectures) {
    	this.person = Objects.requireNonNull(person);
		this.lectures = Objects.requireNonNull(lectures);
	}

	/**
	 * Returns this planning's person.
	 *
	 * @return not <code>null</code>.
	 */
	public Person getPerson() {
        return person;
    }


	/**
	 * Sets this planning's person.
	 *
	 * @param person
	 *            can't be <code>null</code>
	 */
    public void setPerson(Person person) {
        this.person = Objects.requireNonNull(person);
    }

	/**
	 * Returns this planning's lectures.
	 *
	 * @return not <code>null</code>.
	 */
    public List<Lecture> getLectures() {
        return lectures;
    }

	/**
	 * Sets this planning's lectures.
	 *
	 * @param lectures
	 *            can't be <code>null</code>
	 */
    public void setLectures (ArrayList<Lecture> lectures) {
        this.lectures = Objects.requireNonNull(lectures);
    }

	/**
	 * Add this a lecture to this planning's lectures.
	 *
	 * @param lecture
	 *            can't be <code>null</code>
	 */
    public void addLecture (Lecture lecture) {
        this.lectures.add(Objects.requireNonNull(lecture));
    }
}
