package _01_introduction_to_encapsulation;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	

	//------- itemsReceived ------------------------------
	int getItemsReceived() {
		
		return itemsReceived;
	}
	void setItemsReceived(int itemsReceived) {
		if(itemsReceived < 0) {
			this.itemsReceived = 0;
			
		}else {
		this.itemsReceived = itemsReceived;
	}
	}
	//------- degreesTurned -------------------------------
	float getDegreesTurned() {
		
		return degreesTurned;
	}
	void setDegreesTurned(float degrees) {
		if(degrees < 0 || degrees > 360	) {
			
			return;
		}
		degreesTurned = degrees;
	}
	//------- nomenclature ------------------------------------------------
	String getNomenclature() {
		
		return nomenclature;
	}
	void setNomenclature(String str) {
		if(str.equals("")) {
			nomenclature = " ";
			
		}else {
			nomenclature = str; 
			
		}
		
	}
	//------- memberObj -----------------------------
	Object getMemberObj() {
		
		return memberObj;
	}
	void setMemberObj(Object memberObj) {
		if(memberObj.getClass() == String.class) {
			this.memberObj = new Object();
			
		}else {
			this.memberObj = memberObj;
			
		}
		
	}
	//------- JUnit Test Case -------------------------
	@Test
	public void testItemsReceived() {
		setItemsReceived(5);
			assertEquals(5, getItemsReceived());
		setItemsReceived(-5);
			assertEquals(0, getItemsReceived());
		setItemsReceived(100);
			assertEquals(100, getItemsReceived());
	}
	
	@Test
	public void testNomenclature() {
		setNomenclature("Hello");
			assertEquals("Hello", getNomenclature());
		setNomenclature("");
			assertEquals(" ", getNomenclature());
		
	}
	
	@Test
	public void testMemberObj() {
		setMemberObj(1);
			assertEquals(1, getMemberObj());
		setMemberObj("Hello");
			assertNotEquals("Hello", getMemberObj());
		
	}
	
	@Test
	public void testDegreesTurned() {
		setDegreesTurned(-1);
			assertNotEquals(-1, getDegreesTurned());
		setDegreesTurned(0);
			assertEquals(0, getDegreesTurned());
		setDegreesTurned(180);
			assertEquals(180, getDegreesTurned());
		setDegreesTurned(360);
			assertEquals(360, getDegreesTurned());
		setDegreesTurned(361);
			assertNotEquals(361, getDegreesTurned());
		
	}
	
	
	
	}
