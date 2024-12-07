package com.klef.jfsd.exam;


	public class Course {
	    private Integer courseId;
	    private String courseName;
	    private Integer credits;
	    private Instructor instructor;

	   
	    public Course(Integer courseId, String courseName, Integer credits) {
	        this.courseId = courseId;
	        this.courseName = courseName;
	        this.credits = credits;
	    }

	
	    public void setInstructor(Instructor instructor) {
	        this.instructor = instructor;
	    }

	 
	    public Integer getCourseId() {
	        return courseId;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public Integer getCredits() {
	        return credits;
	    }

	    public Instructor getInstructor() {
	        return instructor;
	    }

	    @Override
	    public String toString() {
	        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits + ", instructor="
	                + instructor + "]";
	    }
	}



