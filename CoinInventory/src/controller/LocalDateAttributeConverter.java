package controller;


import java.time.LocalDate;
import java.sql.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

public class LocalDateAttributeConverter implements AttributeConverter <LocalDate, Date> {
	
	public LocalDateAttributeConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		// TODO Auto-generated method stub
		return (attribute == null ? null: Date.valueOf(attribute));
	}
	//@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		// TODO Auto-generated method stub
		return(dbData == null ? null: dbData.toLocalDate());
	}

}
