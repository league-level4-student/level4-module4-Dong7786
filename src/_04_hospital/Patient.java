
package _04_hospital;

public class Patient extends Hospital {
	boolean cared = false;
	
	void checkPulse() {
		cared = true;
		
	}
	
	boolean feelsCaredFor() {
		return cared;
		
	}
	
}
