public class HospitalApp {
    public static void main(String[] args) {

        Patient p1 = new Patient("Sonam");
        Doctor d1 = new SpecialistDoctor("Dr. Sharma");

        Appointment app = new Appointment(p1, d1);

        try {
            app.bookAppointment();
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
