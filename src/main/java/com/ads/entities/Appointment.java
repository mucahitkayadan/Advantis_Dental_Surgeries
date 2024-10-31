package com.ads.entities;

import java.util.Date;

public class Appointment {
    private Date date;
    private String time;
    private Dentist dentist;
    private Patient patient;
    private Surgery surgery;

    public Appointment(Date date, String time, Dentist dentist, Patient patient, Surgery surgery) {
        this.date = date;
        this.time = time;
        this.dentist = dentist;
        this.patient = patient;
        this.surgery = surgery;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }
}