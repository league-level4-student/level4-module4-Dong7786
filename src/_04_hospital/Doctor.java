package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public boolean performsSurgery() {
		if(this.getClass() == Surgeon.class) {
			return true;
			
		}
			return false;
	}
	
	public boolean makesHouseCalls() {
		if(this.getClass() == GeneralPractitioner.class) {
			return true;
			
		}
		return false;
	}
	
	public void assignPatient(Patient p) throws DoctorFullException{
		
		if(patients.size() > 2) {
			throw new DoctorFullException();

		}else {
			patients.add(p);
			
		}
		
	}
	
	void doMedicine() {
		for(Patient p : patients) {
			p.checkPulse();
			
		}
		
	}
	
	
}
