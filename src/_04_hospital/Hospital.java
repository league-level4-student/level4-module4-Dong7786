package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();

	Hospital() {

	}

	void addPatient(Patient p) {
		patients.add(p);

	}

	public void addDoctor(Doctor d) {
		doctors.add(d);

	}

	ArrayList<Patient> getPatients() {
		return patients;

	}

	ArrayList<Doctor> getDoctors() {
		return doctors;

	}

	void assignPatientsToDoctors() {
		for (Doctor d : doctors) {
			for (Patient p : patients) {
				try {
					d.assignPatient(p);
					patients.remove(p);
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					break;
				}
				
				
			}

		}

	}

	
	

	
}
