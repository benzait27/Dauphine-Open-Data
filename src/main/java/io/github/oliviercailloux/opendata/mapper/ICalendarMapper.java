package io.github.oliviercailloux.opendata.mapper;


import java.util.Date;

import biweekly.ICalendar;
import biweekly.component.VEvent; 
import ezvcard.property.Expertise;
import ezvcard.property.StructuredName;
import io.github.oliviercailloux.opendata.entity.Person;
import io.github.oliviercailloux.opendata.entity.Planning;
import io.github.oliviercailloux.opendata.utils.DateUtils;

public class ICalendarMapper {

	public ICalendarMapper() {
	}
	
	public ICalendar encodePlanningToICalendar(Planning planning) {
		
		ICalendar ical = new ICalendar();

		planning.getTeachings().forEach((teaching) -> {
			VEvent event = new VEvent();
			Date start = DateUtils.transformLocalDateToDate(teaching.getDate());
			event.setDateStart(start);
			event.setLocation(teaching.getRoom());
			event.setDescription(teaching.getCourse().getDescription());
			
			ical.addEvent(event);
			
		});
		
		return ical;
	}
	
}
