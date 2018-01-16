package io.github.oliviercailloux.opendata.mapper;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import biweekly.ICalendar;
import ezvcard.VCard;
import io.github.oliviercailloux.opendata.entity.Course;
import io.github.oliviercailloux.opendata.entity.Person;
import io.github.oliviercailloux.opendata.entity.Planning;
import io.github.oliviercailloux.opendata.entity.Lecture;
import io.github.oliviercailloux.opendata.mapper.ICalendarMapper;
import io.github.oliviercailloux.opendata.mapper.VcardMapper;

public class ICalendarMapperTest {

	@Test
	public void testEncodePlanningToICalendar() {
        Course course = new Course();
        course.setDescription("test");
        Planning planning = new Planning(new Person());
		
		planning.addLecture(new Lecture(course, new Date()));
		ICalendarMapper iCalendarMapper = new ICalendarMapper();
		
		ICalendar ical = iCalendarMapper.encodePlanningToICalendar(planning);
		
		assertEquals("test", ical.getEvents().get(0).getDescription().getValue());
		
	}

}
