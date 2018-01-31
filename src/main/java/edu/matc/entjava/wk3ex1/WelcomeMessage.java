package edu.matc.entjava.wk3ex1;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WelcomeMessage extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        LocalTime noon = LocalTime.of(12,00,00);
        LocalTime quittinTime = LocalTime.of(17,00,00);
        LocalDate springBreak = LocalDate.of(2018,03,9);
       // LocalDate springBreak = LocalDate.of(2018,01,30);

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        if (date.isEqual(springBreak)) {
            out.println("TIME DOESN'T MATTER IT'S SPRING BREAK!");
        } else if (time.isBefore(noon)) {
            out.println("GOOD MORNING SUNSHINE!");
        } else if (time.isBefore(quittinTime)) {
            out.println("Good afternoon!");
        } else if (time.isAfter(quittinTime)) {
            out.println("Good evening!");
        }


    }
}
