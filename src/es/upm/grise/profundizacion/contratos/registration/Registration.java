package es.upm.grise.profundizacion.contratos.registration;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.google.java.contract.Invariant;

import es.upm.grise.profundizacion.contratos.courses.Course;

@Invariant("getNumberCourses() < 11 &&" + " getTotalCredits() < 37 &&" + "getRegistrationFee() >= 0")
public class Registration {
	
	Set<Course> courses = new TreeSet<Course>();
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public double getRegistrationFee() {
		
		double total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getFee();
		}
		
		return total;
		
	}
	
	public int getTotalCredits() {
		
		int total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getCredits();
		}
		
		return total;
		
	}
	
	public int getNumberCourses() {
		
		int total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			it.next();
			total += 1;
		}
		
		return total;
		
	}

}
