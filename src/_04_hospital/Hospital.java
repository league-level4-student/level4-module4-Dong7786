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
		for(int i = 0; i < doctors.size(); i ++) {
			for(int p = patients.size() -1; p >= 0; p --) {
				System.out.println(patients.size() + ", " + i);
				try {
					doctors.get(i).assignPatient(patients.get(p));
					patients.remove(p);
				} catch (DoctorFullException e) {
					break;
				}
				
				
			}

		}

	}
	/* doctor size: 3 		doctor number: 2
	 * patient size: 0		assigned patients: 2
	 * 
	 * i = 2; 
	 * p = 2;
	 */

	
}
