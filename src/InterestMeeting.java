import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.out;

public class InterestMeeting {
	public static void main(String[] args) throws ParseException {
		Interest meeting =  new Interest();
		Date myDate = new SimpleDateFormat("MM/dd/yyyy").parse(meeting.date);
		out.print("Come on " + new SimpleDateFormat("EEE, d MMM yyyy").format(myDate) + " or ");
		myDate = new SimpleDateFormat("MM/dd/yyyy").parse(meeting.date2);
		out.println(new SimpleDateFormat("EEE, d MMM yyyy").format(myDate));
		learnCoding();
	}
	public static void learnCoding(){
		out.println("Join us in Ms. Coffman's room in KLab afterschool");
		out.println("Useful for AI and Web Design ");
	}
}
