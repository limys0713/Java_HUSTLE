package bookingUpForBeauty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class AppointmentScheduler {
	public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        // Compare the appointment date with current time
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        // Call the time function, for extracting the time
        // Cannot compare time using comparison operators in Java
        LocalTime time = appointmentDate.toLocalTime();
        return (!time.isBefore(LocalTime.of(12, 00)) && time.isBefore(LocalTime.of(18, 00))) ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // Include text literal in ofPattern using ''
        // EEEE : full day of the week (Monday, etc)
        // a : AM or PM
        // H : 24-hour clock, h : 12-hour clock
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("'You have an appointment on' EEEE',' MMMM d, yyyy, 'at' h:mm a'.'");
        return printer.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        // getYear(), not toLocalYear()
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
