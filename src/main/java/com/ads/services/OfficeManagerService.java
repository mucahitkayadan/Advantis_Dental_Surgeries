package com.ads.services;

import com.ads.entities.Dentist;
import com.ads.entities.Patient;
import com.ads.entities.Appointment;
import com.ads.entities.Surgery;

import java.util.ArrayList;
import java.util.List;

public class OfficeManagerService {
    private List<Dentist> dentists = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void registerDentist(Dentist dentist) {
        dentists.add(dentist);
        System.out.println("Dentist registered: " + dentist.getFirstName() + " " + dentist.getLastName());
    }

    public void enrollPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient enrolled: " + patient.getFirstName() + " " + patient.getLastName());
    }

    public void bookAppointment(Appointment appointment) {
        if (canBookAppointment(appointment.getDentist())) {
            appointments.add(appointment);
            System.out.println("Appointment booked for patient: " + appointment.getPatient().getFirstName());
        } else {
            System.out.println("Cannot book more than 5 appointments for the dentist in a week.");
        }
    }

    private boolean canBookAppointment(Dentist dentist) {
        long count = appointments.stream()
                .filter(a -> a.getDentist().equals(dentist))
                .count();
        return count < 5;
    }

    public List<Appointment> getDentistAppointments(Dentist dentist) {
        return appointments.stream()
                .filter(a -> a.getDentist().equals(dentist))
                .toList();
    }

    public List<Appointment> getPatientAppointments(Patient patient) {
        return appointments.stream()
                .filter(a -> a.getPatient().equals(patient))
                .toList();
    }

    public void cancelAppointment(Appointment appointment) {
        if (appointments.remove(appointment)) {
            System.out.println("Appointment cancelled successfully");
        } else {
            System.out.println("Appointment not found");
        }
    }

    public List<Appointment> getSurgeryAppointments(Surgery surgery) {
        return appointments.stream()
                .filter(a -> a.getSurgery().equals(surgery))
                .toList();
    }

    public List<Dentist> getAllDentists() {
        return new ArrayList<>(dentists);
    }

    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients);
    }
}
