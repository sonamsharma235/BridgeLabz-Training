class Appointment implements HospitalService {
    Patient patient;
    Doctor doctor;

    Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void bookAppointment() throws AppointmentNotAvailableException {
        if (!doctor.available)
            throw new AppointmentNotAvailableException("Appointment not available!");

        doctor.available = false;
        System.out.println("Appointment booked for " + patient.name);
        System.out.println("Doctor: " + doctor.name);
        System.out.println("Fee: ₹" + doctor.consultationFee());
    }
}
