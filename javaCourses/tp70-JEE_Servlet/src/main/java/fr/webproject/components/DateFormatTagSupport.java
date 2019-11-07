package fr.webproject.components;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateFormatTagSupport extends SimpleTagSupport {
	
	private Date date;
	private String format;
	
	public void doTag() throws JspException, IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		String formattedDate = dateFormat.format(date);
		
		JspWriter out = getJspContext().getOut();
		out.println(formattedDate);
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
