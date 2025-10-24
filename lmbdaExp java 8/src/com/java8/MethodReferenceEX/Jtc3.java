package com.java8.MethodReferenceEX;
@FunctionalInterface
interface Hello{
	Course test(int a,String b,String c,String d );
	
}
class Course{
	private int courseId;
	private String courseName;
	private String duration;
	private String trainer;
	
	public Course() {
		System.out.println("Course() constr in Course");
	}
	public Course(int courseId, String courseName, String duration, String trainer) {
		   System.out.println("4 para constr ");
			this.courseId = courseId;
			this.courseName = courseName;
			this.duration = duration;
			this.trainer = trainer;
		}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", trainer="
				+ trainer + "]";
	}
		
	
}
public class Jtc3 {
	public static void main(String[] args) {
		Hello h1=(a,b,c,d)->{
		Course c1= new Course(a,b,c,d);
		return c1;
		};
		Course c11=h1.test(1, "full Satck Developer", "8 months", "Som Prakash");
		System.out.println(c11);
		System.out.println("************\n");
		Hello h2 =Course::new;
		Course c12 =h2.test(2, "java8 full course", "1 months", "Som");
		System.out.println(c12);
	}

}
