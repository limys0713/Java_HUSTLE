package bookingUpForBeauty;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		AppointmentScheduler scheduler = new AppointmentScheduler();
		System.out.println(scheduler.schedule("7/25/2019 13:45:00"));
		// Task 2
		System.out.println(scheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0)));
		// Task 3
		System.out.println(scheduler.isAfternoonAppointment(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
		// Task 4
		System.out.println(scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
		// Task 5
		System.out.println(scheduler.getAnniversaryDate());
	}

}
